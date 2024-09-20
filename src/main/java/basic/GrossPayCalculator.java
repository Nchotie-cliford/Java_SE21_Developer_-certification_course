package basic;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("How many hours did you work?");
        Scanner sc = new Scanner(System.in);
        int hours  = sc.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = sc.nextDouble();

        sc.close();

        double payRate = hours * rate;

        System.out.println("Gross pay: " + payRate);
    }
}
