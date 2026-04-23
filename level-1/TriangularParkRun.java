import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the number of rounds needed to complete 5 km
    // Formula: rounds = distance / perimeter
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter  = side1 + side2 + side3;          // Perimeter in meters
        double distanceM  = 5 * 1000;                        // 5 km converted to meters
        double rounds     = distanceM / perimeter;
        return rounds;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for 3 sides of the triangle (in meters)
        System.out.println("Enter the 3 sides of the triangular park (in meters):");
        System.out.print("  Side 1 : ");
        double side1 = scanner.nextDouble();

        System.out.print("  Side 2 : ");
        double side2 = scanner.nextDouble();

        System.out.print("  Side 3 : ");
        double side3 = scanner.nextDouble();

        // Validate that all sides are positive
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("\nInvalid input! All sides must be positive values.");
        } else {

            // Step 2: Calculate perimeter
            double perimeter = side1 + side2 + side3;

            // Step 3: Call the method to calculate rounds
            double rounds = calculateRounds(side1, side2, side3);

            // Display the result
            System.out.println("\n--- Triangular Park Run Summary ---");
            System.out.println("Side 1             : " + side1 + " m");
            System.out.println("Side 2             : " + side2 + " m");
            System.out.println("Side 3             : " + side3 + " m");
            System.out.println("Perimeter          : " + perimeter + " m");
            System.out.println("Target Distance    : 5 km (5000 m)");
            System.out.printf( "Rounds Required    : %.2f rounds%n", rounds);
            System.out.println("Full Rounds Needed : " + (int) Math.ceil(rounds) + " rounds (rounded up)");
        }

        scanner.close();
    }
}