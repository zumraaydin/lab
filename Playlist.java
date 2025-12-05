import java.util.ArrayList;

public class Playlist {

    // data fields
    private String name;
    private ArrayList<String> songs;

    // constructor
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<String>();
    }

    // getName
    public String getName() {
        return name;
    }

    // addSong
    public void addSong(String songName) {
        songs.add(songName);
    }

    // removeSong
    public void removeSong(String songName) {
        songs.remove(songName);
    }

    // printSongs
    public void printSongs() {
        System.out.println("Playlist: " + name);

        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }

    // getSongCount
    public int getSongCount() {
        return songs.size();
    }
}
