import java.awt.*;
import java.awt.event.*;

class Form1 extends Frame implements ActionListener {
    Checkbox cricket, badminton, male, female;
    CheckboxGroup cbg;
    Button b;

    Form1() {
        cbg = new CheckboxGroup();

        male = new Checkbox("Male", cbg, false);
        female = new Checkbox("Female", cbg, false);

        cricket = new Checkbox("Cricket");
        badminton = new Checkbox("Badminton");

        b = new Button("Submit");

        setLayout(null);

        male.setBounds(50, 50, 100, 30);
        female.setBounds(150, 50, 100, 30);

        cricket.setBounds(50, 100, 100, 30);
        badminton.setBounds(150, 100, 100, 30);

        b.setBounds(50, 150, 100, 30);

        add(male);
        add(female);
        add(cricket);
        add(badminton);
        add(b);

        b.addActionListener(this);

        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (cricket.getState()) {
            System.out.println("Cricket");
        }
        if (badminton.getState()) {
            System.out.println("Badminton");
        }
        if (male.getState()) {
            System.out.println("Male");
        }
        if (female.getState()) {
            System.out.println("Female");
        }
    }

    public static void main(String[] args) {
        new Form1();
    }
}
