package interfaces.smart;

public class PrintCoordinates {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.getGPSCoordinates();

        GPS smartWatch1 = new SmartWatch();
        smartWatch1.getGPSCoordinates();

        displayGPSForSupportedCoordinates(new SmartWatch());
        displayGPSForSupportedCoordinates(new SmartPhone());

        GPS[] devices = new GPS[3];
        devices[0] = new SmartWatch();
        devices[1] = new SmartPhone();
        devices[2] = new SmartWatch();
        for (GPS gps : devices) {
            gps.getGPSCoordinates();
        }

        playChannelRadio(new SmartPhone());
        nextChannel(new SmartPhone());
    }

    public static void displayGPSForSupportedCoordinates(GPS device) {
        System.out.println("Searching location...");
        System.out.println(device.getGPSCoordinates());
    }

    public static void playChannelRadio(Radio radio) {
        radio.playChannel();
    }

    public static void nextChannel(Radio radio) {
        radio.next();
    }
}
