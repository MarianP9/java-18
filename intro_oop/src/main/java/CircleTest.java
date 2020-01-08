public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "R");
        Circle c2 = new Circle(7, "V");
        Circle c3 = new Circle(8, "N");
        Circle c4 = new Circle(7, "Black");

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.color);

        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c2.color);

        System.out.println(c3.getArea());
        System.out.println(c3.getPerimeter());
        System.out.println(c3.color);

        System.out.println(c4.toString());

        Circle[] circleArray = new Circle[10];

        for (int i = 0; i < circleArray.length; i++) {
            if (i % 2 == 0) {
                Circle circle = new Circle(i + 1, "Blue");
                circleArray[i] = circle;
            } else {
                Circle circle = new Circle(i + 1, "Green");
                circleArray[i] = circle;
            }
        }

        for (Circle circle : circleArray) {
            System.out.println(circle.toString());
        }
    }
}
