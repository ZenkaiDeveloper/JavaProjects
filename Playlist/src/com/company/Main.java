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

public class Main {

    public static void main(String[] args) {
	    Album allTheRightReasons = new Album();
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
    }
}
