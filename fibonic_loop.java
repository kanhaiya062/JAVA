public class  fibonic_loop {
    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to generate
        long[] fibonacciNumbers = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Calculate and store the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Print the Fibonacci sequence
        System.out.println("Fibonacci Sequence (first " + n + " numbers):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }
}
 
