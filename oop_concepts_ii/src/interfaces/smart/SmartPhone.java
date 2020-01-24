package interfaces.smart;

public class SmartPhone implements GPS, Radio {
    @Override
    public long getGPSCoordinates() {
        System.out.println("GPS coordinates for SmartPhone");
        return 100;
    }

    @Override
    public void playChannel() {
        System.out.println("Playing channel");
    }

    @Override
    public void stopChannel() {
        System.out.println("Stopping channel");
    }

    @Override
    public void next() {
        System.out.println("Smartphone:"); //Do something else then call base function
        Radio.super.next();
    }
}
