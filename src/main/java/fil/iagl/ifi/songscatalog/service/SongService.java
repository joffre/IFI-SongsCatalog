package fil.iagl.ifi.songscatalog.service;

import fil.iagl.ifi.songscatalog.model.Song;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service("songService")
@Transactional
public class SongService implements SongServiceInterface {
    private static final AtomicLong counter = new AtomicLong();
    private static List<Song> songs;

    static {
        songs = new ArrayList<>();
        songs.add(new Song(counter.incrementAndGet(), "Highway to Hell", "Highway to Hell", "AC/DC"));
        songs.add(new Song(counter.incrementAndGet(), "Bohemian Rhapsody", "A Night at the Opera", "Queen"));
        songs.add(new Song(counter.incrementAndGet(), "Hysteria", "Absolution", "Muse"));
    }

    @Override
    public List<Song> findAllSongs() {
        return songs;
    }

    @Override
    public Song findById(long id) {
        for (Song song: songs) {
            if (song.getId() == id) return song;
        }
        return null;
    }
}
