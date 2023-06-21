package ödev;
import java.util.Scanner;

public class ödev5 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the time = ");
        float t = inp.nextFloat();
        if ( t >= 0 && t < 9) {
            System.out.println("You are not working now.");
        }else if ( t >= 9 && t <= 12) {
            System.out.println("You are working now.");


        }else if(t > 12 && t < 13) {
            System.out.println("You are at the breaktime now.");
        }else if (t >= 13 && t <=17) {
            System.out.println("You are working now.");
        }else if (t > 17 && t <= 24) {
            System.out.println("You are not working now.");
        }else {
            System.out.println("You entered an invalid value for time.");
        }
    }
}
