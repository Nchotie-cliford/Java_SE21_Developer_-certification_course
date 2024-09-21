package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Would you like to add another number? (True/False)");
            again = sc.nextBoolean();
        } while (again);
        sc.close();


    }
}

