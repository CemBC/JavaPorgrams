package ödev;
import java.util.Scanner;

public class ödev4 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter an integer = ");
        int n = inp.nextInt();
        if ( n < 0) {
            System.out.println("Your number is negative...");
        } else if ( n > 0) {
            System.out.println("Your number is positive...");
        }else {
            System.out.println("Your number is zero...");
        }
    }
}
