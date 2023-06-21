package W.Week4;
import java.util.Random;

public class Random10 {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        int attempts = 10;
        int a;
        for(int i = 0 ; i<10 ; i++) {
            a = rd.nextInt(0,1000);
            System.out.println("The Number = " + a);
            attempts -= 1;
            if(attempts == 0) {
                break;
            }

        }
    }
}
