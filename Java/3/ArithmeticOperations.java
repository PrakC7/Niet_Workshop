import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Handle division by zero
        String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "Undefined (division by zero)";
        String remainder = (num2 != 0) ? String.valueOf(num1 % num2) : "Undefined (modulus by zero)";

        // Output results
        System.out.println("\n--- Arithmetic Operations Result ---");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + remainder);

        scanner.close();
    }
}
