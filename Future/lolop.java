package Future;
import java.util.Scanner;
public class lolop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the line size = " );
        int l = inp.nextInt();
        System.out.print("Enter the star number = " );
        int s = inp.nextInt();
        for (int i = 0; i < l; i++) {
            for(int j = 0; j < s ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
