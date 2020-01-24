package interfaces.shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.6);
        circle.displayArea();

        Shape rectangle = new Rectangle(10, 20);
        rectangle.displayArea();
    }
}
