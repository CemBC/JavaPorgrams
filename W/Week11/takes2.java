package W.Week11;

public class takes2 {
    public static int maximus(int a , int b) {
        if(a > b) {
            return a;

        }else {
            return b;
        }

    }
    public static void main(String [] args) {
        int a = 3;
        int b = 4;
        System.out.println(maximus(a,b));
    }
}
