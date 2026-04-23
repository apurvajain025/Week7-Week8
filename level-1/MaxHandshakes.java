import java.util.Scanner;

public class MaxHandshakes {

    // Step 3: Method to calculate maximum number of handshakes
    // Formula: combination = n * (n - 1) / 2
    public static int calculateHandshakes(int numberOfStudents) {
        int handshakes = numberOfStudents * (numberOfStudents - 1) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get integer input for numberOfStudents
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validate input — need at least 2 students for a handshake
        if (numberOfStudents < 2) {
            System.out.println("\nAt least 2 students are needed for a handshake.");
        } else {

            // Step 2: Call the method to calculate handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            // Step 4: Display the result
            System.out.println("\nThe maximum number of handshakes among "
                    + numberOfStudents + " students is " + handshakes);
        }

        scanner.close();
    }
}