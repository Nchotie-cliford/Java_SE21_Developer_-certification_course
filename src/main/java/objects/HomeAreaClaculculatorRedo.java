package objects;

import java.util.Scanner;

public class HomeAreaClaculculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       HomeAreaClaculculatorRedo calculator = new HomeAreaClaculculatorRedo();
       Rectangle room1 = calculator.getRoom();
       Rectangle room2 = calculator.getRoom();
       double totalArea = calculator.calculateAreaOfRoom(room1, room2);
       System.out.println("Area of both rooms; " + totalArea);

    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);

    }

    public double calculateAreaOfRoom(Rectangle roome1, Rectangle roome2) {
        return roome1.calculateArea() + roome2.calculateArea();

    }

}
