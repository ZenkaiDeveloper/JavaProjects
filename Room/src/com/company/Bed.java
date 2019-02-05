package com.company;

public class Bed {
    private String style;
    private int height;
    private int sheets;
    private int pillows;
    private int quilts;


    public Bed(String style, int height, int sheets, int pillows, int quilts) {
        this.style = style;
        this.height = height;
        this.sheets = sheets;
        this.pillows = pillows;
        this.quilts = quilts;
    }

    public void make(){
        System.out.println("Making the bed!");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }
}
