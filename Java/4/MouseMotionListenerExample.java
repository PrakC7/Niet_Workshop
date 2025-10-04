import java.awt.*;
import java.awt.event.*;

class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    Label l1;

    MouseMotionListenerExample() {
        setSize(600, 600);
        setLayout(null);
        l1 = new Label();
        l1.setBounds(50, 50, 200, 50);
        add(l1);
        addMouseMotionListener(this);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        l1.setText("Mouse Dragged");
        Graphics g = getGraphics();
        g.setColor(Color.blue);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public void mouseMoved(MouseEvent e) {
        l1.setText("Mouse Moved");
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
