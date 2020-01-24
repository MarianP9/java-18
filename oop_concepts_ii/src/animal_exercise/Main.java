package animal_exercise;

public class Main {
    public static void main(String[] args) {
        Animal spider = new Spider();
        spider.walk();

        Animal fish = new Fish();
        fish.eat();
        ((Fish) fish).setName("Booker");
        ((Fish) fish).play();
    }
}
