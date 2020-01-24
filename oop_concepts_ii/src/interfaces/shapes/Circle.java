package interfaces.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void displayArea() {
        System.out.println("Area of circle is " + Math.PI * radius * radius);
    }
}
