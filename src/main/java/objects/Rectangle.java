package objects;

public class Rectangle {
    protected double length;
    protected double width;

    protected int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth( width);
    }

    private void setWidth(int i) {
        return;
    }

    public void print(){
        System.out.println("i am a rectangle");
    }

    public double calculatePerimeter () {
        return(2 * length) + (2 * width);

    }

   public double calculateArea () {
        return(length * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
