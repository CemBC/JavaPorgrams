package W.week10;
import java.util.Scanner;



public class Scenario0 {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        String s = "";
        String rs = "";
        int max = 0;
        while(true){
            System.out.println("Write \"STOP\" to stop the cycle");
            System.out.print("The word = ");
            s = inp.nextLine();
            if(s.equals("STOP")) break;
            if(s.length() > max) {
                max = s.length();
                rs = s;
            }


        }
        System.out.println("Longest word is = " + rs);
    }

}
