package W.Week5;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the variable N = ");
            int N = inp.nextInt();
            System.out.print("Enter the variable M = ");
            int M = inp.nextInt();
            if ( M < 0 || N < 0 ) {
                break;
            }
            if(Divisible(N,M)){
                System.out.println("N is divisible by M.");
            }else {
                System.out.println("N is NOT divisible by M.");
            }
        }

    }
    public static boolean Divisible(int N, int M) {
        if((N % M) == 0) {
            return true;
        }else{
            return false;
        }
    }

}
