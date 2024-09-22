package methods;

import java.util.Scanner;

public class CreditCheck {
    public static void main(String[] args) {
        double salary = getUserSalary();
        double creditscore = getUserCreditscore();


        if (salary >= 25000 && creditscore >= 700) {
            System.out.println("You have being approve a credit");
        }
        else {
            System.out.println("You have not being approve a credit");
        }


    }

    public static double getUserSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        return salary;
    }

    public static double getUserCreditscore() {
        System.out.println("Enter Credit Score: ");
        Scanner sc = new Scanner(System.in);
        double creditscore = sc.nextDouble();
        return creditscore;
    }


}
