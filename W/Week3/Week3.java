package W.Week3;
import java.util.Scanner;

public class Week3 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("What lenght of your movie is ? (as minute) = ");
        int l = inp.nextInt();
        if ( l> 0 && l <= 30 ) {
            System.out.println("This is a short movie.");
        }else if (l> 30 && l <= 90) {
            System.out.println("The movie can broadcast on TV as it is.");
        } else if( l > 90 && l <= 120) {
            System.out.println("Should be cut so that it can be broadcast on TV.");
        }else if ( l > 120 ) {
            System.out.println("Its not suitable for TV.");
        }else {
            System.out.println("There is no type of time value.");
        }

    }
}
