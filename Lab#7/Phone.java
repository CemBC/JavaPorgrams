
public class Phone {
    private String model;
    private int modelYear;
    private MusicPlayer player;
    private Radio radio;
    private GPSApp gps;
    private WaetherApp weather;


    public Phone(String model, int modelYear, MusicPlayer player, Radio radio, GPSApp gps, WaetherApp weather) {
        this.model = model;
        this.modelYear = modelYear;
        this.player = player;
        this.radio = radio;
        this.gps = gps;
        this.weather = weather;
    }

    public WaetherApp getWeather() {
        return weather;
    }

    public GPSApp getGps() {
        return gps;
    }

    public Radio getRadio() {
        return radio;
    }

    public MusicPlayer getPlayer() {
        return player;
    }
}


