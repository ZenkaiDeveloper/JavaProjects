package com.company;

public class Ceiling {
    private int height;
    private String paintedColor;

    public Ceiling(int height, String paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight(){
        return this.height;
    }

    public String paintedColor(){
        return paintedColor;
    }
}
