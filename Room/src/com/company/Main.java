package com.company;

public class Main {

    public static void main(String[] args) {
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall northWall = new Wall("North");
        Wall southWall = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "Marble White");
        Bed bed = new Bed("modern", 4, 3, 2, 3);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Randall", eastWall, westWall, northWall, southWall, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
