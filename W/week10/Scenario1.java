package W.week10;
import java.util.Random;
import java.util.Scanner;
public class Scenario1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        String pool ="abcdefghjklmnoprştuvyzxABCDEFGHJKLMNOPRSTUVYZX!'+%&/()?_#${[]}*";
        String[] poolarr = pool.split("");
        System.out.print("The lenght of the password = ");
        int l = inp.nextInt();
        String s = "";
        for (int i = 0; i < l; i++) {
            int index = rd.nextInt(64);
            s += poolarr[index];
        }
        System.out.println("Your random password = " + s);
    }
}
