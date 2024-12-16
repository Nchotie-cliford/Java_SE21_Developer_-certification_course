package Ticket;

public class myTicket {
    public static void main (String [] args) {
        String firstName = "Sandy" ;
        String lastName = "Jones" ;
        String movieTitle = "The Source Code" ;
        int numberOfTicket = 8 ;
        double ticketPrice = 10.57 ;

        String userName = firstName.toLowerCase() + lastName.toLowerCase() ;


        double totalTicketPrice = ticketPrice * numberOfTicket   ;

        System.out.println("Username:" + userName );
        System.out.println("Movie Title:" + movieTitle );
        System.out.println("number of Ticket:" + numberOfTicket );
        System.out.println("price per ticket: $" + ticketPrice );
        System.out.println("total price of 8  ticket:" + totalTicketPrice + "\n");

        System.out.println("Thank you for choosing us for booking your movie tickets ");
        System.out.println("Enjoy your movie!!! ");


    };
}
