package accessmodifiers.package2;

import accessmodifiers.package1.Clock;

public class SmartClock extends Clock {
    public SmartClock(long time, long offset) {
        super(time, offset);
    }

    public long convertToMilliseconds() {
        return time/1000;
    }
}
