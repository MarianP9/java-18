package Inheritance.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Yuki");

        Cat cat2 = new Cat();
        cat2.setName("Midori");

        Dog dog1 = new Dog();
        dog1.setName("Kazuto");

        Animal[] animalShelter = {cat1, cat2, dog1};
        for (Animal animal : animalShelter) {
            System.out.println(animal.getName());
        }
    }
}
