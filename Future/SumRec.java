package Future;
import java.util.Scanner;
public class SumRec {
    public static int sum(int N) {
        if (N == 0) return 0;
        return N + sum(N-1);
    }
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N = ");
        int N = inp.nextInt();
        System.out.println(sum(N));
    }
}
