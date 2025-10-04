import java.awt.*;
import java.awt.event.*;

public class MouseListener extends Frame {

    Label l1;

    public MouseListener() {
        setSize(600, 600);
        setLayout(null);
        l1 = new Label();
        l1.setBounds(50, 50, 200, 50);
        add(l1);
        addMouseListener(this);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
        Graphics g = getGraphics();
        g.setColor(Color.blue);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseListener();
    }
}
