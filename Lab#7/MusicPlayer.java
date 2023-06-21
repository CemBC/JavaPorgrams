public class MusicPlayer implements Playable{
    private String artistName;
    private String albumName;
    private String songName;
    private double songDuration;
    private int volumeLevel;

    public MusicPlayer(String artistName , String albumName , String songName , double songDuration , int volumeLevel) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.songDuration = songDuration;
        this.songName = songName;
        this.volumeLevel = volumeLevel;
    }
    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {

    }

    @Override
    public void prev() {

    }
}
