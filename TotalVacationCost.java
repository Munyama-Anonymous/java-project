import java.util.Scanner;

public class TotalVacationCost {

    // Method to calculate total cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter accommodation cost: ");
        double accommodation = input.nextDouble();

        System.out.print("Enter meal cost: ");
        double meals = input.nextDouble();

        System.out.print("Enter activity cost: ");
        double activities = input.nextDouble();

        // Call method
        double total = calculateTotalCost(accommodation, meals, activities);

        // Display result
        System.out.println("Total Vacation Cost: $" + total);

        input.close();
    }
}