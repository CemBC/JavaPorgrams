package W.Week4;

public class Summation {
    public static void main(String [] args ){
        int sum = 0;
        for(int i = 0 ; i < 101 ; i++) {
            sum += i*i + 3*i -4;

        }
        System.out.println(sum);

    }
}

