package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHours = 40;

        System.out.println(" How many hours did you work?");
        Scanner sc = new Scanner(System.in);
        double hoursWorked = sc.nextDouble();

        sc.close();

        while (hoursWorked >maxHours || hoursWorked < 0) {
            System.out.println("Invalid entry, your hours must be between 0 to 40");
            hoursWorked = sc.nextDouble();
            sc.close();
        }
        double grossPay = hoursWorked * rate;

        System.out.println(grossPay);
    }
}
