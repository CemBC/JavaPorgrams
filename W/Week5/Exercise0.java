package W.Week5;

public class Exercise0 {
    public static void main(String [] args) {
        int t = 10;
        for(int i = 0; i < t ; i++) {
            if(i*i % t == 1) {
                System.out.println(i);
            }
        }
    }
}
