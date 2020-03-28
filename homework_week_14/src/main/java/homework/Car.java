package homework;

import java.util.Optional;

public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private int horsePower;
    private Optional<Boolean> isElectric;

    public Car(String manufacturer, String model, int year, int horsePower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.isElectric = Optional.empty();
    }

    public Car(String manufacturer, String model, int year, int horsePower, boolean isElectric) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.isElectric = Optional.of(isElectric);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getYear() {
        return year;
    }

    public Optional<Boolean> getIsElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}
