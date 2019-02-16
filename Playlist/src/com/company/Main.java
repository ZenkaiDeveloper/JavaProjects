package com.company;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.util.*;


public class Main {

    private static ArrayList<Album> albums = Album.getAllAlbums();
    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static Scanner scanner = new Scanner(System.in);

    private static void printInstructions(){
        System.out.println("Print Instructions Press 0.");
        System.out.println("To Quit Press 1.");
        System.out.println("To Skip Forward Press 2.");
        System.out.println("To skip backwards Press 3.");
        System.out.println("To repeat a song Press 4.");
        System.out.println("To See all songs in the playlist Press 5.");
    }

    private static void printPlaylist(LinkedList<Song> songs){
        Iterator<Song> iterator = songs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }

    public static void main(String[] args) {
	    Album allTheRightReasons = new Album("All The Right Reasons");
        allTheRightReasons.addSong(new Song("Follow You Home", 4.1));
        allTheRightReasons.addSong(new Song("All The Wrong Reasons", 4.2));
        allTheRightReasons.addSong(new Song("Photograph", 3.36));
        allTheRightReasons.addSong(new Song("Animals", 4.2));
        allTheRightReasons.addSong(new Song("Savin Me", 5.2));
        allTheRightReasons.addSong(new Song("Far Away", 4.45));
        allTheRightReasons.addSong(new Song("The Next Contestant", 3.34));
        allTheRightReasons.addSong(new Song("Side of a Bullet", 5.43));
        allTheRightReasons.addSong(new Song("Someone That You're With", 4.67));
        allTheRightReasons.addSong(new Song("If Everyone Cared", 4.56));
        allTheRightReasons.addSong(new Song("Rockstar", 4.22));
        albums.get(0).addToPlaylist(3, playList);
        albums.get(0).addToPlaylist(5, playList);
        albums.get(0).addToPlaylist(6, playList);
        albums.get(0).addToPlaylist(8, playList);

        boolean quit = false;
        boolean forwards = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("There are no songs here to play.");
        }else{
            System.out.println("Now playing " + listIterator.next().getTitle());
        }
        printInstructions();
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println("Stopping playlist...");
                    quit = true;
                case 2:
                    if(!forwards){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forwards = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    }else{
                        System.out.println("We have reached the end of the list.");
                        forwards = false;
                    }
                    break;
                case 3:
                    if(forwards){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forwards =false;

                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    }else{
                        System.out.println("At the beginning of the list. No ,more songs previous.");
                    }
                    break;
                case 4:
                    //Repeat
                    if(forwards){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().getTitle());
                            forwards = false;
                        }else {
                            System.out.println("We are at the beginning of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().getTitle());
                            forwards = true;
                        }else{
                            System.out.println("We are at the end of the list");
                        }
                    }

                    break;
                case 5:
                    printPlaylist(playList);
                    break;
                default:
                    printInstructions();
            }
        }

    }





}
