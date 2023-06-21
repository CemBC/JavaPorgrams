package W.Week4;
import java.util.Random;
public class GSrandom {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        int max;
        int min;
        int b;
        int a;
        a = rd.nextInt(100,1000);
        max = a;
        min = a;
        for( int i = 0 ; i < 10 ; i++) {
            b = rd.nextInt(100,1000);
            if ( b > max) {
                max = b;
            }if ( b < min) {
                min = b;

            }





        }
        System.out.println("Max = " + max + "\n" + "Min = " + min);
    }
}
