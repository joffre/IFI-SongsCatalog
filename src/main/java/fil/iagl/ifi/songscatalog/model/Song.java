package fil.iagl.ifi.songscatalog.model;

/**
 * Model.
 */
public class Song {
    private long id;
    private String name;
    private String album;
    private String singer;

    public Song() {
        this.id = 0;
    }

    public Song(long id, String name, String album, String singer) {
        this.id = id;
        this.name = name;
        this.album = album;
        this.singer = singer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (id != song.id) return false;
        if (!name.equals(song.name)) return false;
        if (!album.equals(song.album)) return false;
        return singer.equals(song.singer);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + album.hashCode();
        result = 31 * result + singer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", album='" + album + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
