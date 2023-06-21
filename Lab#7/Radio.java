public class Radio implements Playable {
    private String channelName;
    private String programName;
    private int volumeLevel;

    public Radio(String channelName , String programName , int volumeLevel) {
        this.channelName = channelName;
        this.programName = programName;
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
