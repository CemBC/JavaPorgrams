public class Eat extends Activity{
    @Override
    void completed() {
        setTimeLeft(getTimeLeft()-0.5);
        setEnergy(getEnergy()+10);
    }
}