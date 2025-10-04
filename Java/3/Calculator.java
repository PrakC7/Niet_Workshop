import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {
    Button plus, minus, mult, div;
    Label FN, SN, Result;
    TextField tf1, tf2, tfResult;

    Calculator() {
        // Initialize Frame
        setTitle("Calculator");
        setLayout(null);
        setSize(500, 300);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Labels
        FN = new Label("Enter First Number:");
        SN = new Label("Enter Second Number:");
        Result = new Label("Result:");

        // TextFields
        tf1 = new TextField();
        tf2 = new TextField();
        tfResult = new TextField();
        tfResult.setEditable(false);

        // Buttons
        plus = new Button("+");
        minus = new Button("-");
        mult = new Button("*");
        div = new Button("/");

        // Set bounds
        FN.setBounds(50, 50, 150, 30);
        tf1.setBounds(220, 50, 200, 30);

        SN.setBounds(50, 90, 150, 30);
        tf2.setBounds(220, 90, 200, 30);

        Result.setBounds(50, 130, 150, 30);
        tfResult.setBounds(220, 130, 200, 30);

        plus.setBounds(50, 180, 50, 30);
        minus.setBounds(120, 180, 50, 30);
        mult.setBounds(190, 180, 50, 30);
        div.setBounds(260, 180, 50, 30);

        // Add components
        add(FN);
        add(tf1);
        add(SN);
        add(tf2);
        add(Result);
        add(tfResult);
        add(plus);
        add(minus);
        add(mult);
        add(div);

        // Add action listeners
        plus.addActionListener(this);
        minus.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(tf1.getText());
            double num2 = Double.parseDouble(tf2.getText());
            double result = 0;

            if (e.getSource() == plus) {			//e.getSource() defines the clicks
                result = num1 + num2;
            } else if (e.getSource() == minus) {
                result = num1 - num2;
            } else if (e.getSource() == mult) {
                result = num1 * num2;
            } else if (e.getSource() == div) {
                if (num2 == 0) {
                    tfResult.setText("Error: Divide by zero");
                    return;
                }
                result = num1 / num2;
            }

            tfResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
