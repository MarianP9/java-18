package accessmodifiers.package1;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(10, 1);
        clock.setTime(11);

        //object creating by calling static method
        Clock clock1 = Clock.newInstance();
        clock1.setTime(100);
        System.out.println(clock1.getTime());

        //object creating by calling static method
        //clock1 and clock2 point to the same object
        Clock clock2 = clock.newInstance();
        System.out.println(clock2.getTime());
    }
}
