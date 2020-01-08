package Composition;

public class Room {
    String color;
    int size;

    public Room() {
        color = "White";
        size = 10;
    }

    public Room(int size) {
        color = "White";
        this.size = size;
    }

    public Room(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
