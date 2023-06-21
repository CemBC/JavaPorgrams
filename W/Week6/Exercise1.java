package W.Week6;
import java.util.Scanner;
public class Exercise1 {
    public static void  Magic(int v) {

        boolean flag = false;
        for( int i = 2 ; i < v ; i++) {
            if( v % i == 0) {
                flag = false;
                break;
            }else {
                flag = true;
            }
        }

        System.out.println("Operating on " + v );

        if( v % 5 == 0 || v % 2 == 0 || v % 3 == 0 || flag == true) {
            if (v % 5 == 0) {
                System.out.println((float)v / 5);
            }
            if (v % 2 == 0) {
                System.out.println((float)v / 2);
            }
            if (v % 3 == 0) {
                System.out.println((float)v / 3);
            }

            if (flag) {
                System.out.println("The " + v + " is prime.");
            }
        }else {
            System.out.println("I have nothing to do with this value.");

        }
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the Value = ");
            int v = inp.nextInt();
            Magic(v);
        }
    }
}
