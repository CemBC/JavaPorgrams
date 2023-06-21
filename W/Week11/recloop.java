package W.Week11;

public class recloop {
    public static int summer(int a ) {
        int sum = 0;
        while(true) {
            if(a == 0) {
                break;
            }
            sum += a;
            a--;

        }
        return sum;

    }
    public static void main(String [] args) {
        System.out.println(summer(10));
    }
}

