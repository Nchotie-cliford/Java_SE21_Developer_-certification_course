package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args ) {
        String name = getUserName();
        greetUser(name);
    }

    public static String getUserName () {
        System.out.println("Enter Name");
        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        return name;
    }

    public static void  greetUser(String name) {
        System.out.println("Welcome " + name);
    }

}
