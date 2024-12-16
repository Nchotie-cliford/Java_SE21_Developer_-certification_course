package Ticket;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator: ");
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        String operator = sc.nextLine();

        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
            result = num1 - num2;
            break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");

        }
        System.out.println(result);

    }
}
