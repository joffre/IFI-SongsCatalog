package fil.iagl.ifi.songscatalog.service;

import fil.iagl.ifi.songscatalog.model.Song;

import java.util.List;

/**
 * Service.
 *
 * TODO: add all required methods for a complete service.
 */
public interface SongServiceInterface {
    List<Song> findAllSongs();
    Song findById(long id);
}
