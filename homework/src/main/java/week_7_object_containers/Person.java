package week_7_object_containers;

import java.util.Objects;

class Person {

    private String name;
    private int age;


    Person(String name, int age) {
        this.name = (name != null) ? name : "Missing_name";
        this.age = age;
    }


    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}
