package Ticket;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the flavor you want");
        String iceCreamFlavor = sc.nextLine();


        switch (iceCreamFlavor) {
            case "Strawberyy":
                System.out.println("Strawberyy ice cream");
                break;
            case "Vanilla" :
                System.out.println("Vanilla ice cream");
                break;
            case "Mango":
                System.out.println("Mango ice cream");
                break;

            case "Chocolate" :
                System.out.println("Chocolate ice cream");
                break;
            default:
                System.out.println("I will like a glass of water.");

        }
    }
}

