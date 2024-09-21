package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus  = 200;
        int quota = 10;

        System.out.println("How many sales did the employee get this month?");
        Scanner sc = new Scanner(System.in);
        int sales  = sc.nextInt();

        sc.close();


        if( sales == quota) {
            salary = salary +  bonus;
        }
        if( sales > quota){
            salary = 2 * bonus + salary;
        }

        System.out.println("Salary is: " + salary);
    }
}
