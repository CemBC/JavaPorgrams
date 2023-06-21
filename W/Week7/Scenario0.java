package W.Week7;
import java.util.Scanner;
import java.util.Random;
public class Scenario0 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        int[] arr = {23,45,67,89,500,450,1500,5,13,56};
        System.out.println("Enter a negative value to stop.");
        int sum = 0;
        int attempt = 0;
        while(true){
            System.out.print("Code " + attempt + " is ?= ");
            int line = inp.nextInt();
            if(line < 0 ) break;
            sum += arr[line];
            attempt += 1;


        }
        System.out.println("Your total cost is " + sum);

    }
}
