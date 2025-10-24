
public class Main {
    public static void main(String[] args) {
        DoublyLinkedPlaylist playlist = new DoublyLinkedPlaylist();

        playlist.addSong("Shape of You");
        playlist.addSong("Perfect");
        playlist.addSong("Photograph");

        playlist.showCurrent();   // Now Playing → Shape of You
        playlist.nextSong();      // Now Playing → Perfect
        playlist.nextSong();      // Now Playing → Photograph
        playlist.nextSong();      // End of playlist 🎵
        playlist.previousSong();  // Now Playing → Perfect
        playlist.previousSong();  // Now Playing → Shape of You
        playlist.previousSong();  // Start of playlist 🎵
    }
}
