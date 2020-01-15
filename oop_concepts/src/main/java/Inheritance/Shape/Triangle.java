package Inheritance.Shape;

public class Triangle extends Shape {
    public void flipVertical() {
        System.out.println("The shape has been flipped vertically");
    }

    public void flipHorizontal() {
        System.out.println("The shape has been flipped horizontally");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("The triangle has been drawn");
    }
}
