import java.util.Scanner;

public class LeapYear {

    // -------------------------------------------------------
    // Method: Check if the given year is a Leap Year
    // Conditions:
    //   a) Year must be >= 1582 (Gregorian calendar)
    //   b) Divisible by 4 AND (not divisible by 100 OR divisible by 400)
    // -------------------------------------------------------
    public static boolean isLeapYear(int year) {
        // Condition a: Must be a valid Gregorian calendar year
        if (year < 1582) {
            return false;
        }

        // Condition b: Leap year logic
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // -------------------------------------------------------
    // Main Method
    // -------------------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take year input from user
        System.out.print("Enter a Year: ");
        int year = scanner.nextInt();

        // Step 2: Check validity and display result
        System.out.println("========================================");

        if (year < 1582) {
            System.out.println("  Invalid! Year must be >= 1582");
            System.out.println("  (Gregorian calendar starts from 1582)");
        } else if (isLeapYear(year)) {
            System.out.println("  " + year + " is a Leap Year! 🗓");
        } else {
            System.out.println("  " + year + " is NOT a Leap Year.");
        }

        System.out.println("========================================");

        scanner.close();
    }
}