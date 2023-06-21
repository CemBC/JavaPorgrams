package Future;
import java.util.Scanner;
public class RecursiveGCD {
    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number 1 = ");
        int a = inp.nextInt();
        System.out.print("Number 2 = ");
        int b = inp.nextInt();
        System.out.println("GCD is = " + GCD(a,b));
    }
 }
