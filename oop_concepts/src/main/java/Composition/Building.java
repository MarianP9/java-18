package Composition;

public class Building {
    private String name;
    private Room room;

    public Building(String name) {
        this.name = name;
        this.room = new Room();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoomColor(String color) {
        room.setColor(color);
    }

    public void setRoomSize(int size) {
        room.setSize(size);
    }
}
