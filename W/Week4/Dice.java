package W.Week4;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        Scanner inp = new Scanner(System.in);
        int attempt = 0;
        int score = 100;

        do {
            int dice1 = rd.nextInt(1, 7);
            int dice2 = rd.nextInt(1, 7);

            System.out.println("Dice-1 = " + dice1 + "\nDice-2 = " + dice2 + "\n");
            if (score-dice1 < 0 && score-dice2 < 0){
                System.out.println("Not any proper values.\n");
                continue;
            }

                System.out.print("Which one do you want to choose, 1 or 2 ? = ");
                int choice = inp.nextInt();
                System.out.println();
                attempt += 1;

                if (choice == 1) {
                    score -= dice1;
                    System.out.println("New score = " + score + "\n");

                } else if (choice == 2) {
                    score -= dice2;
                    System.out.println("New score = " + score + "\n");

                } else {
                    System.out.println("Not proper value of dice.");

                }



        }while(score != 0);
        System.out.println("Congratulations! Your attempt is " + attempt );
    }
}
