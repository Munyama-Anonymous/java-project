// Program to compute discount 
/*
*Name : Joel Githara
*Reg No: J77_1054-2024 
*Description: Program to compute discount
*/
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount, amountToPay;
       

        // prompt user to enter amount
        System.out.println("Enter  name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the amount purchased: ");
        double amount = scanner.nextDouble(); // nextInt, nextLine, nextFloat

        if (amount > 5000) {
            discount = amount * (10/100);
        } else if (amount >= 1000 && amount <= 5000) {
            discount = amount * (5/100);
        } else {
            discount = 0;
        }
        double netAmount = amount - discount;   
        System.out.println("Initial amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + amountToPay);
        }}
