package A;

public class Arrayfib {
    public static void main(String [] args) {
        int numFib = 50;
        long[] fib = new long[numFib];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < numFib; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.print("[");
        for (int i = 0; i < fib.length-1; i++) {
            System.out.print(fib[i] + ",");
        }
        System.out.print(fib[49]);
        System.out.print("]");
    }
}
