package algorithmsanddatastructure.fibonacci;

public class Fibonacci {
    //0, 1, 1, 2, 3, 5, 8, 13,
    // Method to calculate the Fibonacci number at index n
    public static long fibonacci(int n) {
        //Base cases: if n is 0 or 1 ,return n
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Initialize two variables to store the previous and current Fibonacci numbers
        long prev = 0;
        long current = 1;

        // Use a loop to calculate the Fibonacci number at index n
        for (int i = 2; i <= n; i++) {
            // Calculate the next Fibonacci number as the sum of the previous and current numbers
            long next = (prev + current);
            // Update the values of prev and current for the next iteration
            prev = current;
            current = next;
        }
        // Return the calculated Fibonacci number
        return current;
    }


    public static void main(String[] args) {
        int n = 10;
        // // Calculate the Fibonacci number at index 10 and print the result
        long result = fibonacci(n);
        System.out.println("Fibonacci number at index " + n + ": " + result);

    }
}
