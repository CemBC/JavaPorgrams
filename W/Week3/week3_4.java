package W.Week3;
import java.util.Scanner;

public class week3_4 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your x value = ");
        float x = inp.nextFloat();
        if(x < 0) {
            float r = x*x + 3*x + 1;
            System.out.println("The result of f(x) at point " + x + " is " + r);
        }else if (x > 0 ) {
            float r = 2*x*x + x -2;
            System.out.println("The result of f(x) at point " + x + " is " + r);
        }else {
            float r = 3*x;
            System.out.println("The result of f(x) at point " + x + " is " + r);
        }
    }
}
