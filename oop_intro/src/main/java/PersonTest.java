public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        Person p2 = new Person("Bogdan");
        System.out.println(p2.name);
        p1.name = "Ana";
        System.out.println(p1.name);
    }
}
