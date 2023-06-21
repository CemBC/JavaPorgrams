package F;

public class fib2 {
    public static int fib(int n) {
        if(n == 0) return 0;
        int n1 = 0;
        int n2 = 1;
        int f = 1;
        for(int i= 0;i<n-2;i++) {
            f = n1 + n2;
            n1 = n2;
            n2 = f;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("fib("+n + ") is " + fib(n));
    }
}


