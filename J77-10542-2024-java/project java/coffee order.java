// Program to display coffee order
/*
*Name: Joel Githara
*Reg No: J77-10542-2024
 
*/
import java.util.Scanner;
public class CoffeeOrder {
    private String size;
    private double price;
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }
    public String getSize() {
        return size;
    }
    
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Large", 4.50);
        CoffeeOrder order2 = new CoffeeOrder("Medium", 3.75);
        System.out.println("Order 1 - Size: " + order1.getSize() + ", Price: $" + order1.getPrice());
        System.out.println("Order 2 - Size: " + order2.getSize() + ", Price: $" + order2.getPrice());
    }
}
