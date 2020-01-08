package Composition;

public class Main {
    public static void main(String[] args) {
        Building buildingA = new Building("CBC");
        buildingA.setRoomSize(100);
        buildingA.setRoomColor("Blue");
        System.out.println(buildingA.getName()
                + " has color " + buildingA.getRoom().getColor()
                + " and size " + buildingA.getRoom().getSize());
    }
}
