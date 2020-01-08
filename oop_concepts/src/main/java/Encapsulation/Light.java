package Encapsulation;

public class Light {

    public static final int MAX = 100;
    public static final int MIN = 0;
    private int brightness;
    private int step;

    public Light(int step) {
        this.step = step;
    }

    public void on() {
        System.out.println("Brightness is " + MAX);
        brightness = MAX;
    }

    public void off() {
        System.out.println("Brightness is " + MIN);
        brightness = MIN;
    }

    public void brighten() {
        if (brightness + step <= MAX) {
            brightness += step;
            System.out.println("Brightness is " + brightness);
        } else
            System.out.println("Can't increase brightness anymore");
    }

    public void dim() {
        if (brightness - step >= MIN) {
            brightness -= step;
            System.out.println("Brightness is " + brightness);
        } else
            System.out.println("Can't dim brightness anymore. The light is off.");
    }

}
