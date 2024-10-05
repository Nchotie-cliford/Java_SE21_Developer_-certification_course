package inheritance;

import objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
        //person person = new person();
        //Employee employee = new Employee();
        Square square = new Square();
        square.setLength(25);
        square.calculatePerimeter();

        System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        square.print("sqaure");

    }
}
