   import java.util.Scanner;
   int steps
public static fitnessapp {
    system.out.println("enter steps walked today:");
    steps = input.nextInt();
    
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000&& steps < 10000) {
            return "Good";
        } else if (steps >= 4000&& steps < 7000) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    
    
}