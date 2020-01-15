package Inheritance.Animal;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Woof");
    }

    public void bark(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("Woof");
        }
        System.out.print("\n");
    }
}
