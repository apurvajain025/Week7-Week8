public class SpringSeason {

    // Method to check if the given month and day fall in Spring Season
    // Spring Season: March 20 (3/20) to June 20 (6/20)
    public static boolean isSpring(int month, int day) {
        // After March 20 and before June 20 (inclusive)
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5)  return true;
        if (month == 6 && day <= 20)   return true;
        return false;
    }

    public static void main(String[] args) {
        // Validate command-line arguments
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            System.out.println("Example: java SpringSeason 4 15");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);

        // Validate ranges
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
            return;
        }
        if (day < 1 || day > 31) {
            System.out.println("Invalid day! Please enter a value between 1 and 31.");
            return;
        }

        // Check and print result
        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}