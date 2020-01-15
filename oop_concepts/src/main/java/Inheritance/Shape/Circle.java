package Inheritance.Shape;

import Inheritance.Shape.Shape;

public class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle{" +
                "color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("The circle has been drawn");
    }
}
