package W.Week4;
import java.util.Scanner;
public class GCD {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("First Number = ");
        int num1 = inp.nextInt();
        System.out.print("Second Number = ");
        int num2 = inp.nextInt();
        int ebob = 1;
        for(int i = 1; i <= num1 && i <= num2 ; i++) {
            if( num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }

        }System.out.println("GCD of numbers is " + ebob);
    }
}

