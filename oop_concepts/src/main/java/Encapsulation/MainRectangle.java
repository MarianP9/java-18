package Encapsulation;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20.0, 10.0);
        System.out.println("The area of rectangle1 is " + rectangle1.getArea());
        System.out.println("The area of rectangle1 is " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(40.0, 40.0);
        System.out.println("The diagonal of rectangle2 is " + rectangle2.getDiagonal());
    }
}
