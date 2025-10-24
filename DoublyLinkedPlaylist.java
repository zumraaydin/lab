public class DoublyLinkedPlaylist {
    Song head;
    Song tail;
    Song current;

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            tail = newSong;
            current = newSong;
            System.out.println("added first song");
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
            System.out.println("added second song");
        }
    }

    public void nextSong() {
        if (current == null) {
            System.out.println("empty song");
        }
        if (current.next != null) {
            current = current.next;
            System.out.println("NS: Now Playing → " + current.title);
        } else {
            System.out.println("End of playlist 🎵");
        }
    }

    // Önceki şarkıya dön
    public void previousSong() {
        if (current == null) {
            System.out.println("Playlist is empty!");
            return;
        }

        if (current.prev != null) {
            current = current.prev;
            System.out.println("PS: Now Playing → " + current.title);
        } else {
            System.out.println("Start of playlist 🎵");
        }
    }

    // Şu an çalan şarkıyı göster
    public void showCurrent() {
        if (current != null)
            System.out.println("Now Playing → " + current.title);
        else
            System.out.println("No song is playing!");
    }
}