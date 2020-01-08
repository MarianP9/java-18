package Aggregation;

public class Car {
    private String color;
    private String name;
    private Engine engine;


    public Car() {
        this.color = "None";
        this.name = "None";
    }

    public Car(Engine engine, String name) {
        this.color = "None";
        this.engine = engine;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
}
