package ödev;
import java.util.Scanner;

public class ödev3_1{
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your day's number...\n"+
                "For Example = Monday(1) , Tuesday(2) etc.\n"+
                "==");
        int d = inp.nextInt();
        switch (d) {
            case 1:
                System.out.println("Your day is Monday.");
                break;
            case 2:
                System.out.println("Your day is Tuesday.");
                break;
            case 3:
                System.out.println("Your day is Wednesday.");
                break;
            case 4:
                System.out.println("Your day is Thursday.");
                break;
            case 5:
                System.out.println("Your day is Friday.");
                break;
            case 6:
                System.out.println("Your day is Saturday.");
                break;
            case 7:
                System.out.println("Your day is Sunday.");
                break;
            default:
                System.out.println("You entered an invalid value...");
                break;
        }
    }
}
