package W.Week5;
import java.util.Scanner;
public class Exercise2 {
    public static double Pyt(double a , double b) {

        return Math.sqrt(a*a+ b*b);
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the line a = ");
            double a = inp.nextDouble();
            System.out.print("Enter the line b = ");
            double b = inp.nextDouble();
            if(a < 0 || b < 0) {
                System.out.println("The length can not be negative.");
                break;
            }
            System.out.println("The hypotenuse is " + Pyt(a,b));
        }

    }
}
