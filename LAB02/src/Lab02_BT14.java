import java.util.Scanner;

public class Lab02_BT14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final int FIXED_CHARGE = 1000;
        final int LIMIT = 50;
        final int RATE_WITHIN_LIMIT = 230;
        final int RATE_50_EXCESS = 480;
        final int RATE_100_EXCESS = 700;
        final int RATE_OVER_100_EXCESS = 900;

        // Input old and new meter readings
        System.out.print("Enter old meter reading: ");
        int oldReading = scanner.nextInt();
        System.out.print("Enter new meter reading: ");
        int newReading = scanner.nextInt();

        // Calculate usage
        int usage = newReading - oldReading;
        int excessUsage = Math.max(0, usage - LIMIT);

        // Calculate costs
        int costWithinLimit = Math.min(usage, LIMIT) * RATE_WITHIN_LIMIT;
        int costExcess = 0;

        if (excessUsage > 0) {
            if (excessUsage <= 50) {
                costExcess = excessUsage * RATE_50_EXCESS;
            } else if (excessUsage <= 100) {
                costExcess = 50 * RATE_50_EXCESS + (excessUsage - 50) * RATE_100_EXCESS;
            } else {
                costExcess = 50 * RATE_50_EXCESS + 50 * RATE_100_EXCESS + (excessUsage - 100) * RATE_OVER_100_EXCESS;
            }
        }

        int totalCost = FIXED_CHARGE + costWithinLimit + costExcess;

        // Output results
        System.out.println("Old Reading: " + oldReading);
        System.out.println("New Reading: " + newReading);
        System.out.println("Cost within limit: " + costWithinLimit + " VND");
        System.out.println("Cost for excess usage: " + costExcess + " VND");
        System.out.println("Total Cost: " + totalCost + " VND");

        scanner.close();
    }
}
