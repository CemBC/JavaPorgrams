package W.Week4;
import java.util.Random;
public class Tails {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        int head = 0;
        int tail = 0;
        int tv;
        for (int i = 0 ; i< 10; i++) {
            tv = rd.nextInt();
            if(tv % 2 == 0) {
                head += 1;
            }else if (tv % 2 == 1) {
                tail += 1;
            }

        }
        System.out.println(head);
        System.out.println(tail);
        float ratio = (float) tail / (float)(tail + head);
        System.out.println("Ratio = " + ratio);


    }
}