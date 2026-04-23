import java.util.Scanner;

public class SimpleInterest {

    // Step 3: Method to calculate Simple Interest
    // Formula: SI = Principal * Rate * Time / 100
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = principal * rate * time / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 2: Take user input for principal, rate, and time
        System.out.print("Enter the Principal amount : ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest : ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years)  : ");
        double time = scanner.nextDouble();

        // Call the method to calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Step 4: Display the result
        System.out.println("\nThe Simple Interest is " + simpleInterest
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time);

        scanner.close();
    }
}