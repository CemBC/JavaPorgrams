package ödev;
import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("*********************\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "*************************");
        System.out.print("Please enter your perform choice = ");
        int p = inp.nextInt();
        if (p == 1) {
            System.out.print("Please enter first number = ");
            int i1 = inp.nextInt();
            System.out.print("Please enter second number = ");
            int i2 = inp.nextInt();
            int r = i1 + i2;
            System.out.println("Result is = " + r);

        } else if (p == 2) {
            System.out.print("Please enter first number = ");
            int i1 = inp.nextInt();
            System.out.print("Please enter second number = ");
            int i2 = inp.nextInt();
            int r = Math.abs(i1-i2);
            System.out.println("Result is = " + r);
        } else if(p==3) {
            System.out.print("Please enter first number = ");
            int i1 = inp.nextInt();
            System.out.print("Please enter second number = ");
            int i2 = inp.nextInt();
            int r = i1 * i2;
            System.out.println("Result is = " + r);
        } else if (p == 4) {
            System.out.print("Please enter first number = ");
            int i1 = inp.nextInt();
            System.out.print("Please enter second number = ");
            int i2 = inp.nextInt();
            int r = i1 / i2;
            System.out.println("Result is = " + r);

        }else {
            System.out.println("You entered an invalid process...");

        }
    }
}
