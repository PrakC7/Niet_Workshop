import java.awt.*;

public class Notepad extends Frame {
    Notepad() {
        setTitle("Notepad");
	Frame f = new Frame();
        setSize(800, 800);
        setLayout(null);
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
	MenuItem m1 = new MenuItem("New tab");
	file.add(m1);
	MenuItem m2 = new MenuItem("New window");
	file.add(m2);
	MenuItem m3 = new MenuItem("New Markdown tab");
	file.add(m3);
	MenuItem m4 = new MenuItem("Open");
	file.add(m4);
	MenuItem m5 = new MenuItem("Recent");
	file.add(m5);
	MenuItem m6 = new MenuItem("Save");
	file.add(m6);
	MenuItem m7 = new MenuItem("Save as");
	file.add(m7);
	MenuItem m8 = new MenuItem("Save all");
	file.add(m8);
	file.addSeparator();
	MenuItem m9 = new MenuItem("Page setup");
	file.add(m9);
	MenuItem m10 = new MenuItem("Print");
	file.add(m10);
	file.addSeparator();
	MenuItem m11 = new MenuItem("Close tab");
	file.add(m11);
	MenuItem m12 = new MenuItem("Close window");
	file.add(m12);
	MenuItem m13 = new MenuItem("Exit");
	file.add(m13);
	MenuItem m14 = new MenuItem("Undo");
	edit.add(m14);
	edit.addSeparator();
	MenuItem m15 = new MenuItem("Cut");
	edit.add(m15);
	MenuItem m16 = new MenuItem("Copy");
	edit.add(m16);
	MenuItem m17 = new MenuItem("Paste");
	edit.add(m17);
	MenuItem m18 = new MenuItem("Delete");
	edit.add(m18);
	edit.addSeparator();
	MenuItem m19 = new MenuItem("Clear formatting");
	edit.add(m19);
	MenuItem m20 = new MenuItem("Search with Bing");
	edit.add(m20);
	edit.addSeparator();
	MenuItem m21 = new MenuItem("Find");
	edit.add(m21);
	MenuItem m22 = new MenuItem("Find Next");
	edit.add(m22);
	MenuItem m23 = new MenuItem("Find Previous");
	edit.add(m23);
	MenuItem m24 = new MenuItem("Replace");
	edit.add(m24);
	MenuItem m25 = new MenuItem("Go To");
	edit.add(m25);
	edit.addSeparator();
	MenuItem m26 = new MenuItem("Select all");
	edit.add(m26);
	MenuItem m31 = new MenuItem("Time/Date");
	edit.add(m31);
	edit.addSeparator();
	MenuItem m32 = new MenuItem("Font");
	edit.add(m32);
	MenuItem m27 = new MenuItem("Zoom");
	view.add(m27);
	MenuItem m28 = new MenuItem("Replace");
	view.add(m28);
	MenuItem m29 = new MenuItem("Word  wrap");
	view.add(m29);
	MenuItem m30 = new MenuItem("Markdown");
	view.add(m30);
        setMenuBar(menuBar);
        TextArea textArea = new TextArea();
        textArea.setBounds(0, 0, 800, 800);
        add(textArea);
        setVisible(true);

	Exit.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
	if(e.getSource()==exit)
	Notepad.dispose();
    }
    public static void main(String[] args) {
        new Notepad();
    }
}
