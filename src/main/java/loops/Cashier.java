package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter number of Item u will like to sell");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();

        double total = 0;


        for(int i = 0; i < quantity; i++){
            System.out.println(" Enter price for item ");
            double price = sc.nextDouble();

            //total += price;
            total = total + price;

            //run a specific number of time
            //condition is tested before entering in the loop
            // used when you know how many times the loop should be executed

        }
        sc.close();
        System.out.println("Total is " + total);
    }
}
