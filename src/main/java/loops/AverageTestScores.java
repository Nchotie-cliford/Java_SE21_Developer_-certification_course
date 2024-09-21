package loops;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numberOfstudent = 24;
        int numberOfTests = 4;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; 1 < numberOfstudent; i++) {
            double total = 0;

            for(int j = 0; j < numberOfTests; j++) {
                System.out.println("Score for Test # " + (j +1));
                double score = sc.nextDouble();
                total += score;
            }

            double average = total / numberOfTests;
            System.out.println("Average score: " + (i +1) + average);
        }

    }
}
