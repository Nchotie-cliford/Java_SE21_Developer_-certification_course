package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;// Constant --when you know value won't change
    private static final int MAX_TICKETS_NUMBER = 69;

    public static void main(String[] args) {
        int[] tickets = generateNumbers();
        printTicket(tickets);

    }

    public static int[] generateNumbers() {
        int[] tickets = new int[LENGTH];
        Random random = new Random();

        for(int i = 0 ; i < LENGTH ; i++){
            int randonNumer;
            do {
                randonNumer= random.nextInt(1, MAX_TICKETS_NUMBER + 1);
            } while (search(tickets,randonNumer ));
            tickets[i] = randonNumer;
        }
        return tickets;
    }
    public static boolean search(int[] array, int  numberToSearchFor){
        for(int value : array){
            if(value == numberToSearchFor) return true;
        }
        return false;

        //perfect for collections of objects - take element from array ans aasign to value
    }
    public static void printTicket(int[] array){
        Arrays.sort(array);

        for(int number : array){
            System.out.print(number + " | ");
        }

        //another way to loop through an array

//        for(int i =  0; i < array.length; i++){
//            System.out.print(array[i] + "  | " );
//        }
    }

}
