public class Study extends Activity{
    @Override
    void completed() {
        setTimeLeft(getTimeLeft()-1.5);
        setCompletionPercentage(getCompletionPercentage()+15);
        setEnergy(getEnergy()-25);
    }
}