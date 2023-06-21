package F;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fibonacci {
    public static int fib(int x) {
        if (x <= 1) {
            return x;
        }
        return fib(x-1) + fib(x - 2);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List a = new ArrayList();

        System.out.print("Enter the number that what fiboncci value you want = ");
        int num = inp.nextInt();
        int tn = num;
        for (num = 1; num < tn +1 ; num++) {
            a.add(fib(num));

        }
        System.out.println(a);
    }
}

// eğer bu kodu kullanıyorsan lütfen 10 dan fazla değer girme yoksa pc naneyi yiyor

// 1 1 2 3 5 8 13 21 34 55 79 ...........................