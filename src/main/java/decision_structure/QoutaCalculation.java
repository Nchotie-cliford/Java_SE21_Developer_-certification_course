package decision_structure;

import java.util.Scanner;

public class QoutaCalculation {
    public static void main(String[] args) {
        int qouta =  10;
        System.out.println("Enter number of sales made");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        if(sales >= qouta){
            System.out.println("You have successfully made it ,  congrade");
        }
        else {
            int salesShort = qouta - sales;
            System.out.println("you did not make you qouta.  " +  " You were short by " +  salesShort  + " sales");
        }

    }
}

