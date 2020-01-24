package abstraction;

public abstract class Car {
    public abstract void start();

    public void stop() {
        System.out.println("The car has stopped");
    }
}
