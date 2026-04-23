import java.util.Scanner;

public class SumOfNaturalNumbers {

    // -------------------------------------------------------
    // Method 1: Find sum using Recursion
    // -------------------------------------------------------
    public static long sumRecursive(int n) {
        if (n == 1) {           // Base case
            return 1;
        }
        return n + sumRecursive(n - 1);  // Recursive case
    }

    // -------------------------------------------------------
    // Method 2: Find sum using Formula => n*(n+1)/2
    // -------------------------------------------------------
    public static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    // -------------------------------------------------------
    // Main Method
    // -------------------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input and validate Natural Number
        System.out.print("Enter a Natural Number (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! A Natural Number must be greater than 0.");
            return;
        }

        // Step 2: Compute using both methods
        long recursiveResult = sumRecursive(n);
        long formulaResult   = sumFormula(n);

        // Step 3: Display results
        System.out.println("\n========================================");
        System.out.println("  Sum of first " + n + " Natural Numbers");
        System.out.println("========================================");
        System.out.println("  Recursive Method  : " + recursiveResult);
        System.out.println("  Formula n*(n+1)/2 : " + formulaResult);
        System.out.println("----------------------------------------");

        // Step 4: Compare and print verification
        if (recursiveResult == formulaResult) {
            System.out.println("  ✔ Both results MATCH! Computation is correct.");
        } else {
            System.out.println("  ✘ Results DO NOT match. Something went wrong.");
        }
        System.out.println("========================================");

        scanner.close();
    }
}