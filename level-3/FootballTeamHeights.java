import java.util.Random;

public class FootballTeamHeights {

    // -------------------------------------------------------
    // Method 1: Find the Sum of all heights
    // -------------------------------------------------------
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // -------------------------------------------------------
    // Method 2: Find the Mean height
    // Formula: mean = sum of all elements / number of elements
    // -------------------------------------------------------
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // -------------------------------------------------------
    // Method 3: Find the Shortest height
    // -------------------------------------------------------
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // -------------------------------------------------------
    // Method 4: Find the Tallest height
    // -------------------------------------------------------
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    // -------------------------------------------------------
    // Main Method
    // -------------------------------------------------------
    public static void main(String[] args) {
        // Step 1: Create int array of size 11 (football team)
        int[] heights = new int[11];
        Random random = new Random();

        // Step 2: Generate random 3-digit heights between 150 and 250 cms
        // Formula: random.nextInt(101) gives 0–100, then add 150 → range 150–250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

        // Step 3: Display all player heights
        System.out.println("==========================================");
        System.out.println("       FOOTBALL TEAM - PLAYER HEIGHTS     ");
        System.out.println("==========================================");
        for (int i = 0; i < heights.length; i++) {
            System.out.printf("  Player %2d  :  %d cms%n", (i + 1), heights[i]);
        }

        // Step 4: Compute and display results
        System.out.println("------------------------------------------");
        System.out.printf("  Sum of Heights  :  %d cms%n",   findSum(heights));
        System.out.printf("  Mean Height     :  %.2f cms%n", findMean(heights));
        System.out.printf("  Shortest Height :  %d cms%n",   findShortest(heights));
        System.out.printf("  Tallest Height  :  %d cms%n",   findTallest(heights));
        System.out.println("==========================================");
    }
}