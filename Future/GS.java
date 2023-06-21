package Future;
import java.util.Random;
import java.util.Scanner;

public class GS {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        int fn=0;
        int ans;
        System.out.print("The Number = ");
        int temp = inp.nextInt();
        while(true) {
            System.out.print("The Number = ");
            ans = inp.nextInt();
            if (ans < 0) {

                break;
            }
            fn = temp;
            temp = ans;


        }

        if(temp < fn ) {
            System.out.println("Smaller");
        }else if(temp ==  fn){
            System.out.println(("Equals"));
        }else if(temp > fn) {
            System.out.println("Greater");
        }




    }

}

