// Program for a fitness app tracker 
/*
*Name: Joel Githara
*Reg No: J77-10542-2024
*Description: it helps users to track their fitness level 
*/
import java.util.Scanner;
public class fitnessapp {
    public static String getfitnesslevel(int steps) {
        if (steps >= 10000) {
            return "excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "poor";

        }

    }
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your steps for today:");
        int steps = scanner.nextInt();
        String totalsteps = getfitnesslevel(steps);

        System.out.println("your fitness level: "+ totalsteps);
    }
}

