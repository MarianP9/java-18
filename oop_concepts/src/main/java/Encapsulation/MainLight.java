package Encapsulation;

public class MainLight {
    public static void main(String[] args) {

        Light light1 = new Light(25);
        System.out.println("Encapsulation.Light 1: ");
        light1.on();
        light1.off();
        light1.dim();
        light1.brighten();

        Light light2 = new Light(50);
        System.out.println("Encapsulation.Light 2: ");
        light2.brighten();
        light2.brighten();
        light2.dim();
    }
}
