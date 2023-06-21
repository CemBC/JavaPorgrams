package W.Week5;
import java.util.Scanner;
public class Exercise3 {
    public static int fib(int x) {
        if( x <= 1) {
            return x;
        }
        return fib(x-1) + fib(x-2);
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the nTH value that you want = ");
        int v = inp.nextInt();
        System.out.println(fib(v));
    }
}


//1 1 2 3 5 8 13 21 34 55