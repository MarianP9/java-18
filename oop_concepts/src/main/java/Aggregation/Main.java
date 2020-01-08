package Aggregation;

public class Main {
    public static void main(String[] args) {
        Engine vwEngine = new Engine();
        vwEngine.setCapacity(75);
        vwEngine.setPower(1);

        System.out.println("VW Engine capacity is " + vwEngine.getCapacity());
        System.out.println("VW Engine power is " + vwEngine.getPower());

        Car vwCar = new Car(vwEngine, "VW");
        vwCar.setColor("Black");

        System.out.println("Car " + vwCar.getName()
                + " has color " + vwCar.getColor()
                + " and engine of power " + vwCar.getEngine().getPower()
                + " and capacity " + vwCar.getEngine().getCapacity());
    }
}
