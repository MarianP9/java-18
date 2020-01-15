package Inheritance.Shape;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Red");
        System.out.println("The circle's color is " + circle.getColor());
        circle.draw();
        circle.erase();
        circle.move();

        Triangle triangle = new Triangle();
        triangle.setColor("Blue");
        triangle.draw();
        triangle.erase();
        triangle.move();
        triangle.flipHorizontal();
        triangle.flipVertical();

        //Polymorphism
        Shape[] shapeArray = new Shape[3];
        Triangle t1 = new Triangle();
        t1.setColor("Black");
        Circle c1 = new Circle();
        c1.setColor("Red");
        Square s1 = new Square();
        s1.setColor("Gray");
        shapeArray[0] = t1;
        shapeArray[1] = c1;
        shapeArray[2] = s1;

        for (Shape shape : shapeArray) {
            System.out.println(shape.getColor());
            if (shape instanceof Triangle) {
                ((Triangle) shape).flipHorizontal();
            }
        }
    }
}
