package W.Week3;
import java.util.Scanner;

public class week3_1 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("You want to divide a integer,"+
                "what would be the divide number? = ");
        float i = 10;
        float div = inp.nextInt();
        if (div == 0) {
            System.out.println("The result is undefined.");
        } else {

                float r = i / div;
                i = r;
                System.out.println("The result is " + r);
            }
        }


    }

