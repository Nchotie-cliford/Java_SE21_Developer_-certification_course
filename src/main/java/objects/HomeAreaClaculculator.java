package objects;

public class HomeAreaClaculculator {


    public static void main(String[] args) {
        Rectangle roome1  = new Rectangle();
        roome1.setLength(50);
        roome1.setWidth(25);
        double areaOfRoome1 = roome1.calculateArea();

        Rectangle roome2  = new Rectangle( 30, 75);
        double areaOfRoome2 = roome2.calculateArea();

        double totalArea = areaOfRoome1 + areaOfRoome2;
        System.out.println("Total area of both room: " + totalArea);

    }

}
