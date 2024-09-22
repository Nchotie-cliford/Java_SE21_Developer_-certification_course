package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalry = 25000;
    static int requiredCreditscore = 700;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        sc.close();

        boolean qaulified = isUserQualified(salary, creditScore);

        notifyUser(qaulified);
    }

    public static void notifyUser(boolean qaulified) {
        if (qaulified) {
            System.out.println("Congratulation you are approved");
        }
        else{
            System.out.println("You are not approved");
        }
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (salary >= requiredSalry && creditScore >= requiredCreditscore) {
            return true;
        }
        else {
            return false;
        }
    }

    public static double getSalary(){
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        return salary;

    }
    public static int getCreditScore(){
        System.out.println("Enter Credit Score");
        int creditScore = sc.nextInt();
        return creditScore;

    }
}
