package Inheritance.Shape;

public class Square extends Shape {
    @Override
    public String toString() {
        return "Square{" +
                "color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("The square has been drawn");
    }
}
