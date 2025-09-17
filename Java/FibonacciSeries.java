public class FibonacciSeries {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of Fibonacci terms as a command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
