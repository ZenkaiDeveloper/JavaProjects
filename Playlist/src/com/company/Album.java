package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private static ArrayList<Album> allAlbums;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
        allAlbums.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        if(!getSong(song.getTitle())){
            this.songs.add(song);
        }else{
            System.out.println("Cannot add this song");
        }


    }

    public static boolean getAlbum(String name){
        for(int i=0;i<allAlbums.size();i++){
            String currentAlbum = allAlbums.get(i).getName();
            if(currentAlbum === name){
                return true
            }
        }
        return false;
    }

    public Song getSong(String name){
        for(int i=0;i<songs.size();i++){
            Song currentSong = songs.get(i);
            if(currentSong.getTitle().equals(name)){
                return currentSong;
            }
        }
        return null;
    }

    public void addToPlaylist(int trackNumber, LinkedList<Song> songs){
        int index = trackNumber-1;
        if(index >= 0 && index< songs.size()){
            songs.add(this.getSongs().get(index));
        }else{
            System.out.println("Sorry, track does not exist");
        }
    }

    public void addToPlaylist(String trackName, LinkedList<Song> songs){
        Song song = getSong(trackName);
        if(song.getTitle() == trackName){
            songs.add(song);
        }else{
            System.out.println("Song not added, track not found");
        }

    }
}
