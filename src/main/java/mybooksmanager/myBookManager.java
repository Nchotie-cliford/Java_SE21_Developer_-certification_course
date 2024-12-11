package mybooksmanager;

import java.util.Scanner;

public class myBookManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for book title
        System.out.println("Enter Book Title:");
        String bookName = sc.nextLine();

        int bookNameLength = bookName.length(); // Fixed variable name case
        if (bookName.length() >= 20) {
            bookName = bookName.substring(0, 15);
        }

        System.out.println("Book Title length: " + bookNameLength);
        System.out.println("Book name: " + bookName);

        // Input for word
        System.out.println("Enter word:");
        String word = sc.nextLine();

        // Check if the word is in the book name
        if (bookName.contains(word)) {
            System.out.println("The book title contains the word '" + word + "'.");
        } else {
            System.out.println("The book title does not contain the word '" + word + "'.");
        }

        sc.close();
    }

}
