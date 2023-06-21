package Future;

import java.util.Scanner;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        int r = rd.nextInt(100); // up to 100
        int n = -1; // user value
        int attempts = 0;
        do {
            System.out.print("Guess my number: ");
            n = sc.nextInt();
            attempts++;
            if(n > r) {
                System.out.println("Go lower!");
            } else if (n < r) {
                System.out.println("Go higher!");
            } else {
                System.out.println("You found it!");
            }
        } while(r != n);
        System.out.println("You did it in " + attempts + " attempts!");
    }
}
