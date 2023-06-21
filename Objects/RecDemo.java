package Objects;

import java.util.Random;
public class RecDemo{
    public static void main(String [] args){
        Random rd = new Random(System.currentTimeMillis());
        Rec[] recs = new Rec[10];
        for(int i = 0 ; i< 10 ; i ++){
            int a = rd.nextInt(101);
            int b = rd.nextInt(101);
            recs[i] = new Rec(a,b);
        }
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Rectangle " + (i+1));
            System.out.println(recs[i].getA());
            System.out.println(recs[i].getB());
            System.out.println("\n");
        }
    }
}