package decision_structure;

import java.util.Scanner;

public class GradesMessage {
    public static void main(String[] args) {
        System.out.println("Enter Geade");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        sc.close();

        String message;

        switch (grade) {
            case "A": message = "Excellent Job"; break;
            case "B": message = "Great Job"; break;
            case "C": message = "God Job"; break;
            case "D": message = "You need to work a bit harder"; break;
            case "F": message = "Oh ohh"; break;

            default: message = "Error Wrong Input"; break;
        }
        System.out.println(message);
    }
}
