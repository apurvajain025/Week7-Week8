import java.util.Scanner;

public class Factors {

    // -------------------------------------------------------
    // Method 1: Find factors, store in array, and return it
    // -------------------------------------------------------
    public static int[] findFactors(int n) {
        // --- First loop: count the factors ---
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Initialize the array with the exact count
        int[] factors = new int[count];

        // --- Second loop: store the factors into the array ---
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // -------------------------------------------------------
    // Method 2: Find the sum of factors
    // -------------------------------------------------------
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // -------------------------------------------------------
    // Method 3: Find the product of factors
    // -------------------------------------------------------
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // -------------------------------------------------------
    // Method 4: Find the sum of squares of factors
    // -------------------------------------------------------
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // -------------------------------------------------------
    // Main Method
    // -------------------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Step 2: Find and display factors
        int[] factors = findFactors(number);

        System.out.print("\nFactors of " + number + ": ");
        for (int i = 0; i < factors.length; i++) {
            if (i == factors.length - 1)
                System.out.print(factors[i]);
            else
                System.out.print(factors[i] + ", ");
        }

        // Step 3: Display sum, product, and sum of squares
        System.out.println("\n---------------------------------");
        System.out.println("Sum of Factors        : " + findSum(factors));
        System.out.println("Product of Factors    : " + findProduct(factors));
        System.out.println("Sum of Squares        : " + (long) findSumOfSquares(factors));
        System.out.println("---------------------------------");

        scanner.close();
    }
}