import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create an album
        Album album = new Album("Greatest Hits", "The Band");

        // Add songs to the album
        album.addSong("Song 1", 3.5);
        album.addSong("Song 2", 4.0);
        album.addSong("Song 3", 2.8);

        // Create a playlist
        LinkedList<Song> playList = new LinkedList<>();

        // Add songs to the playlist by title
        album.addToPlayList("Song 1", playList);
        album.addToPlayList("Song 3", playList);

        // Add a song to the playlist by track number
        album.addToPlayList(1, playList); // This will add "Song 2"

        // Print the playlist
        System.out.println("Playlist:");
        for (Song song : playList) {
            System.out.println("- " + song.getTitle() + " (" + song.getDuration() + " mins)");
        }
    }
}
