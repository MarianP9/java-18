package interfaces.smart;

public interface Radio {
    void playChannel(); //abstract method

    void stopChannel();

    default void next() {
        System.out.println("Playing next channel");
    }
}
