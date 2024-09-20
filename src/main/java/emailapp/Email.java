package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private  String lastName;
    private String  password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPaawordLength = 10;
    private String  companySuffix = "alphin.com";

    //Constructor to recieve first and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //call a methode asking for the department -return the dapartment
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);

        //call methode to generate password
        this.password = randomPassword(defaultPaawordLength);
        System.out.println(" Your Password is : " + this.password);

        //Combine element to generate email

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your Email is: " + email);


    }
    //Generate Password
    private String randomPassword(int length) {
        String passwordSet  = "ABCDEFGHIJKLMNOPQRSTUVWXY0123456789!§$%&";
        char [] password  = new char[length];
        for (int i = 0; i < length; i++) {
            int rand =  (int)(Math.random() *  passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //ask for the dapartment

    private  String  setDepartment () {
        System.out.print("Department Code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none ");
        Scanner in  = new Scanner(System.in);
         int depChoice = in.nextInt();
         if (depChoice == 1) {
             return "Sales";

         }
         else if (depChoice == 2) {
             return "Development";
         }
         else if (depChoice == 3) {
             return "Accounting";
         }
         else {
             return "none";
         }


    }

    // set the mailbox capacity
    public void setmailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }


    // Generate mailbox capacity #


    // Change the password





}
