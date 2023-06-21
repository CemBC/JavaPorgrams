package Future;
import java.util.Scanner;
public class Maxmin {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a negative value for printing result.");
        int min = 0;
        int max = 0;
        int gecici_sayı;
        System.out.print("The Number = ");
        gecici_sayı = inp.nextInt();
        max = gecici_sayı;
        min = gecici_sayı;
        while(true) {
            System.out.print("The Number = ");
            gecici_sayı = inp.nextInt();
            if (gecici_sayı < 0) {
                break;
            }if (gecici_sayı > max) {
                max = gecici_sayı;
            }if (gecici_sayı < min) {
                min = gecici_sayı;
            }

        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
