import java.util.Scanner;

class NegNumNAE extends Exception {
    public NegNumNAE(String message) {
        super(message);
    }
}

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 positive integers: ");

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.print("Value " + (i + 1) + ": ");
                int value = sc.nextInt();

                if (value < 0) {
                    throw new NegNumNAE("Negative number entered at index " + i);
                }

                numbers[i] = value;
            } catch (NegNumNAE e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                i--;
            }
        }

        System.out.println("\nValues added are:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
