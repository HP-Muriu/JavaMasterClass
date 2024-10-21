import java.util.LinkedList;
import java.util.ArrayList;

public class Album {
    private String title;
    private String artist;
    private SongList songList;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songList = new SongList();
    }

    public void addSong(String title, double duration) {
        Song newSong = new Song(title, duration);
        songList.add(newSong);
    }

    public void addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song foundSong = songList.findSong(trackNumber);
        if (foundSong != null) {
            playList.add(foundSong);
        }
    }

    public void addToPlayList(String title, LinkedList<Song> playList) {
        Song foundSong = songList.findSong(title);
        if (foundSong != null) {
            playList.add(foundSong);
        }
    }

    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber >= 0 && trackNumber < songs.size()) {
                return songs.get(trackNumber);
            }
            return null;
        }
    }
}
