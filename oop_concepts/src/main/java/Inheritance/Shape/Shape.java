package Inheritance.Shape;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("The shape has been drawn");
    }

    public void erase() {
        System.out.println("The shape has been erased");
    }

    public void move() {
        System.out.println("The shape has been moved");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
