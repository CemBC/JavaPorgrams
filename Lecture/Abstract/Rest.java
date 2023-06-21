public class Rest extends Activity{
	
    @Override
    void completed() {
         setEnergy(getEnergy()+25);
         setTimeLeft(getTimeLeft()-1);
    }

}