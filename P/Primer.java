package P;
import java.util.Scanner;
public class Primer {
    public static void main(String [] args ) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number = ");
            int num = inp.nextInt();
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("The number is not primer.");
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println("The number is primer.");
            }
        }
    }
}
