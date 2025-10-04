import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.datatransfer.*;

public class Notepad extends Frame implements ActionListener, KeyListener, MouseListener {
    TextArea textArea;
    Label statusBar;
    String currentFile = null;
    MenuItem newItem, openItem, saveItem, saveAsItem, exitItem;
    MenuItem cutItem, copyItem, pasteItem, selectAllItem, timeDateItem;
    MenuItem zoomItem, wrapItem, statusBarItem;

    boolean zoomed = false;

    public Notepad() {
        setTitle("Notepad");
        setSize(800, 800);
        setLayout(new BorderLayout());

        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        saveAsItem = new MenuItem("Save As");
        exitItem = new MenuItem("Exit");

        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(saveAsItem);
        file.addSeparator();
        file.add(exitItem);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveAsItem.addActionListener(this);
        exitItem.addActionListener(this);

        cutItem = new MenuItem("Cut");
        copyItem = new MenuItem("Copy");
        pasteItem = new MenuItem("Paste");
        selectAllItem = new MenuItem("Select All");
        timeDateItem = new MenuItem("Time/Date");

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        selectAllItem.addActionListener(this);
        timeDateItem.addActionListener(this);

        edit.add(cutItem);
        edit.add(copyItem);
        edit.add(pasteItem);
        edit.add(selectAllItem);
        edit.addSeparator();
        edit.add(timeDateItem);

        zoomItem = new MenuItem("Zoom");
        wrapItem = new MenuItem("Word Wrap");
        statusBarItem = new MenuItem("Status Bar");

        zoomItem.addActionListener(this);
        wrapItem.addActionListener(this);
        statusBarItem.addActionListener(this);

        view.add(zoomItem);
        view.add(wrapItem);
        view.add(statusBarItem);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        setMenuBar(menuBar);

        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);

        statusBar = new Label("Ln 1, Col 1");
        add(statusBar, BorderLayout.SOUTH);

        textArea.addKeyListener(this);
        textArea.addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == newItem) {
            textArea.setText("");
            currentFile = null;
            setTitle("Notepad");
            updateStatusBar();
        } else if (source == openItem) {
            FileDialog fd = new FileDialog(this, "Open", FileDialog.LOAD);
            fd.setVisible(true);
            if (fd.getFile() != null) {
                currentFile = fd.getDirectory() + fd.getFile();
                loadFile(currentFile);
                setTitle("Notepad - " + fd.getFile());
                updateStatusBar();
            }
        } else if (source == saveItem) {
            if (currentFile != null) {
                saveFile(currentFile);
            } else {
                saveAs();
            }
        } else if (source == saveAsItem) {
            saveAs();
        } else if (source == exitItem) {
            dispose();
        } else if (source == cutItem) {
            String selectedText = textArea.getSelectedText();
            if (selectedText != null) {
                StringSelection selection = new StringSelection(selectedText);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
                int start = textArea.getSelectionStart();
                int end = textArea.getSelectionEnd();
                textArea.replaceRange("", start, end);
                updateStatusBar();
            }
        } else if (source == copyItem) {
            String selectedText = textArea.getSelectedText();
            if (selectedText != null) {
                StringSelection selection = new StringSelection(selectedText);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
            }
        } else if (source == pasteItem) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            try {
                String data = (String) clipboard.getData(DataFlavor.stringFlavor);
                int pos = textArea.getCaretPosition();
                textArea.insert(data, pos);
                updateStatusBar();
            } catch (Exception ex) {
                showError("Paste failed.");
            }
        } else if (source == selectAllItem) {
            textArea.selectAll();
        } else if (source == timeDateItem) {
            textArea.insert(new Date().toString(), textArea.getCaretPosition());
            updateStatusBar();
        } else if (source == zoomItem) {
            if (!zoomed) {
                textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
                zoomed = true;
            } else {
                textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
                zoomed = false;
            }
        } else if (source == wrapItem) {
            showError("Word wrap is not supported in AWT TextArea.");
        } else if (source == statusBarItem) {
            statusBar.setVisible(!statusBar.isVisible());
        }
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) { updateStatusBar(); }
    public void keyTyped(KeyEvent e) {}
    public void mouseClicked(MouseEvent e) { updateStatusBar(); }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    void updateStatusBar() {
        try {
            int caretPos = textArea.getCaretPosition();
            String fullText = textArea.getText();
            if (caretPos > fullText.length()) caretPos = fullText.length();
            String text = fullText.substring(0, caretPos);
            int line = text.split("\n", -1).length;
            int lastNewline = text.lastIndexOf('\n');
            int col = caretPos - (lastNewline + 1);
            if (col < 0) col = caretPos + 1;
            statusBar.setText("Ln " + line + ", Col " + (col + 1));
        } catch (Exception ex) {
            statusBar.setText("Ln 1, Col 1");
        }
    }

    void loadFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            textArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            showError("Cannot open file.");
        }
        updateStatusBar();
    }

    void saveFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(textArea.getText());
        } catch (IOException e) {
            showError("Cannot save file.");
        }
    }

    void saveAs() {
        FileDialog fd = new FileDialog(this, "Save As", FileDialog.SAVE);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            currentFile = fd.getDirectory() + fd.getFile();
            saveFile(currentFile);
            setTitle("Notepad - " + fd.getFile());
        }
    }

    void showError(String message) {
        Dialog d = new Dialog(this, "Error", true);
        d.setLayout(new FlowLayout());
        Label l = new Label(message);
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });
        d.add(l);
        d.add(b);
        d.setSize(300, 100);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
