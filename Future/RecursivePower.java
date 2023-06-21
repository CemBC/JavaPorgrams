package Future;
import java.util.Scanner;
public class RecursivePower {
    public static int Power(int b, int t) {
        if( t != 0) {
            return b * Power(b, t -1);
        }
        else {
            return 1;
        }
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("The base = " );
        int b = inp.nextInt();
        System.out.print("The power = ");
        int t = inp.nextInt();
        System.out.println(b + "^" + t +  " is = " + Power(b,t) );
    }
}
