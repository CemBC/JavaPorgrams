package W.Week5;
import java.util.Scanner;
public class ExerciseBonus {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the seed = ");
        int seed = inp.nextInt();
        System.out.print("Enter the nth value that you ask = ");
        int n = inp.nextInt();
        System.out.println("The value that you asked on random function is " + "'" +  X(n,seed)+"'");


    }


    public static int X(int n, int seed) {
        if(n <= 0) {
            return seed;
        }
        return (2*X(n-1,seed) +1) % 10;

    }



    
}
