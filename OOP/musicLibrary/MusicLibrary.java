package musicLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Song {
    String title, artist;
    Song(String t, String a) { title = t; artist = a; }
    public String toString() { return title + " by " + artist; }
}
public class MusicLibrary {
    List<Song> songs = new ArrayList<>();
    Random rand = new Random();
    void addSong(Song s) { songs.add(s); }
    boolean removeSong(String t) { return songs.removeIf(s -> s.title.equals(t)); }
    void playRandom() {
        if (songs.isEmpty()) { System.out.println("No songs!"); return; }
        System.out.println("Playing: " + songs.get(rand.nextInt(songs.size())));
    }
    List<Song> getSongs() { return songs; }
}
    
