public class Circle {
    int radius;
    String color;
    final static double PI = 3.14159;

    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
