package accessmodifiers.package2;

import accessmodifiers.package1.Clock;

public class ReadClock {
    public static void main(String[] args) {
        Clock clock = new Clock(60,20);
        clock.setTime(20);


    }
}
