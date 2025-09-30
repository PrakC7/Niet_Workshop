import java.awt.*;
import java.awt.event.*;

public class ArithmeticAWT extends Frame implements ActionListener {
    Label label1, label2, resultLabel;
    TextField text1, text2;
    Button calculateButton;
    TextArea resultArea;

    ArithmeticAWT() {
        setTitle("Arithmetic Operations");
        setSize(400, 350);
        setLayout(null);
        setVisible(true);
        setBackground(Color.lightGray);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        label1 = new Label("Enter first number:");
        label2 = new Label("Enter second number:");
        text1 = new TextField();
        text2 = new TextField();
        calculateButton = new Button("Calculate");
        resultLabel = new Label("Results:");
        resultArea = new TextArea("", 6, 40, TextArea.SCROLLBARS_NONE);

        label1.setBounds(50, 50, 150, 20);
        text1.setBounds(200, 50, 100, 20);
        label2.setBounds(50, 90, 150, 20);
        text2.setBounds(200, 90, 100, 20);
        calculateButton.setBounds(140, 130, 100, 30);
        resultLabel.setBounds(50, 180, 60, 20);
        resultArea.setBounds(50, 210, 300, 80);

        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(calculateButton);
        add(resultLabel);
        add(resultArea);

        calculateButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(text1.getText());
            double num2 = Double.parseDouble(text2.getText());

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "Undefined (division by zero)";
            String modulus = (num2 != 0) ? String.valueOf(num1 % num2) : "Undefined (modulus by zero)";

            resultArea.setText(
                "Addition: " + sum + "\n" +
                "Subtraction: " + difference + "\n" +
                "Multiplication: " + product + "\n" +
                "Division: " + quotient + "\n" +
                "Modulus: " + modulus
            );
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new ArithmeticAWT();
    }
}
