package W.Week4;
import java.util.Random;

public class TH {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        int T = 0;
        int H = 0;
        int tt;
        int th;
        int turn= 0;
        do {
            turn += 1;
            tt = rd.nextInt(0,9);
            th = rd.nextInt(0,9);

            if( tt < 5) {
                T -= 1;
                if(T < 0) {
                    T = 0;
                }
            }else if( tt >= 5 && tt <10) {
                T += 2;
            }

            if( th < 4) {
                H -= 4;
                if( H < 0) {
                    H = 0;
                }
            }else if(th >= 4 && th < 7) {
                H += 0;
            }else if(th >= 7 && th < 10) {
                H+= 2;
            }

            System.out.println("Turn " + turn);
            System.out.println(" ".repeat(H)+"H");
            System.out.println(" ".repeat(T)+"T");

        }while(T != 79 && H != 79);
    }
}
