package interfaces.smart;

public class SmartWatch implements GPS {
    @Override
    public long getGPSCoordinates() {
        System.out.println("GPS coordinates for SmartWatch");
        return 200;
    }
}
