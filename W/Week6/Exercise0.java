package W.Week6;
import java.util.Scanner;
public class Exercise0 {
    public static int fac(int n) {
        if( n <= 1) {
            return 1;
        }
        return fac(n-1) * n;
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num = inp.nextInt();
        System.out.println("The factorial of the " + num + " is = " + fac(num));

    }
}
