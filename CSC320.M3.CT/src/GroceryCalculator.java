import java.util.Scanner;

public class GroceryCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		        // Prompt User for the coupon amount
		        double couponAmount = 0;
		        boolean validInput = false;
		        
		        while (!validInput) {
		            System.out.print("Enter the coupon amount as a decimal(e.g., .10): ");
		            
		            if (scanner.hasNextDouble()) {
		                couponAmount = scanner.nextDouble();

		                // Ensure the coupon amount is within valid range
		                if (couponAmount > 1.0 || couponAmount <= 0.0) {
		                    couponAmount = 0.10; // Set to 10% if out of range
		                }
		                
		                validInput = true;
		            } else {
		                System.out.println("Invalid input. Please enter a valid decimal format.");
		                scanner.next(); // Consume invalid input
		            }
		        }
		        
		        double[] weeklybills = new double[4];

		        // Prompt User for weekly grocery bills
		        for (int i = 0; i < 4; i++) {
		            System.out.print("Enter the grocery bill for week " + (i + 1) + ": $");
		            weeklybills[i] = scanner.nextDouble();
		        }

		        // Calculate monthly total and weekly average without coupon
		        double monthlyTotalWithoutCoupon = 0;
		        for (double bill : weeklybills) {
		            monthlyTotalWithoutCoupon += bill;
		        }
		        double weeklyAverageWithoutCoupon = monthlyTotalWithoutCoupon / 4;

		        // Calculate monthly total and weekly average with coupon
		        double monthlyTotalWithCoupon = monthlyTotalWithoutCoupon * (1 - couponAmount);
		        double weeklyAverageWithCoupon = monthlyTotalWithCoupon / 4;

		        // Display results
		        System.out.println("\nMonthly total and weekly average without coupon:");
		        System.out.println("Monthly total: $" + monthlyTotalWithoutCoupon);
		        System.out.println("Weekly average: $" + weeklyAverageWithoutCoupon);
		        System.out.println("\nMonthly total and weekly average with coupon:");
		        System.out.println("Monthly total: $" + monthlyTotalWithCoupon);
		        System.out.println("Weekly average: $" + weeklyAverageWithCoupon);

		        // Close the scanner
		        scanner.close();
		    }

	}

