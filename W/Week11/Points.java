package W.Week11;



import java.util.Scanner;
import java.util.Random;
public class Points {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        int z = inp.nextInt();
        Point R = new Point(x,y,z);
        Point[] arr = new Point[50];
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = new Point(rd.nextInt(101),rd.nextInt(101),rd.nextInt(101));

        }
        double max = 0;
        for(Point p : arr) {
            if(R.distanceTo(p) > max) {
                max =  R.distanceTo(p);
            }
        }
        for(Point p : arr) {
            if(R.distanceTo(p) == max) {
                System.out.println("The point that has maximum distance to R is point ("+p.getX()+","+p.getY()+","+p.getZ()+")");
            }
        }
    }
}


