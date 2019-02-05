package com.company;

public class Bedroom {
    private String name;
    private Wall eastWall;
    private Wall westWall;
    private Wall northWall;
    private Wall southWall;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall eastWall, Wall westWall, Wall northWall, Wall southWall, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.eastWall = eastWall;
        this.westWall = westWall;
        this.northWall = northWall;
        this.southWall = southWall;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Making bed...");
        bed.make();

    }
}
