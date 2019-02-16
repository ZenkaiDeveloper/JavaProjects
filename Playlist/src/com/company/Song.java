package com.company;

public class Song {
    private String title;
    private double duration;

    Song(String title, Double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public double getDuration(){
        return duration;
    }
}
