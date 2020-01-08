package Aggregation;

public class Engine {
    private double power;
    private int capacity;

    public Engine() {
        this.capacity = 75;
        this.power = 0.8;

    }

    public Engine(double power, int capacity) {
        if (power <= 75)
            System.out.println("Power cannot be less than 75");
        else if (capacity <= 0.8)
            System.out.println("Capacity cannot be less than 0.8");
        else {
            this.power = power;
            this.capacity = capacity;
        }
    }

    public void setPower(double power) {
        if (power < 0.8)
            System.out.println("Power cannot be less than 75");
        else
            this.power = power;
    }

    public void setCapacity(int capacity) {
        if (capacity < 75)
            System.out.println("Capacity cannot be less than 0.8");
        else
            this.capacity = capacity;
    }

    public double getPower() {
        return power;
    }

    public int getCapacity() {
        return capacity;
    }
}
