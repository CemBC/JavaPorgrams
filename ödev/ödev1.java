package ödev;
import java.util.Scanner;
public class ödev1 {
    public static void main(String  [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Firs integer =");
        int i1 = inp.nextInt();
        System.out.print("Second integer = ");
        int i2 = inp.nextInt();
        if ( i1 > i2) {
            System.out.println(i1 + " is greater than " + i2);
        } else if(i2 > i1) {
            System.out.println(i2 + " is greater than " + i1);
        } else {
            System.out.println(i1 + " and " + i2 + " are equal");
        }
    }
}
