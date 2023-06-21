public class WaetherApp implements Trackable{
    private String city;
    private WaetherCondition currentForecast;

    private WaetherCondition tomorrowsForecas;

    @Override
    public void getCoordinates() {

    }

    public enum WaetherCondition {
        ClOUDY,
        SUNNY,
        RAINY,
        SNOWY,
    }
}
