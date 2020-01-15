package accessmodifiers.package1;

public class Clock {
    protected long time;
    private long offset;
    private static Clock instance;

    private Clock(long time) {
        this.time = time;
    }

    //ways of creating an object that has a private constructor
    //method 1 of accessing a private constructor
    public Clock(long time, long offset) {
        this(time);
        this.offset = offset;
    }

    //method 2 of accessing a private constructor (singleton design pattern)
    public static Clock newInstance() {
        if (instance == null) {
            instance = new Clock(System.currentTimeMillis());
        }
        return instance;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
