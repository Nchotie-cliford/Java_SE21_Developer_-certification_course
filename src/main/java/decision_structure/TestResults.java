package decision_structure;

import java.util.Scanner;

public class TestResults {
    static char grade ;

    public static void main(String[] args) {
        System.out.println("Enter your score");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        sc.close();


        if (score < 60) {
            grade = 'F';
        }
        else if (score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println(grade);
    }
}
