package Inheritance.Animal;

public class Animal {
    private String name;
    private String breed;

    public void eat() {
        System.out.println("The animal is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
