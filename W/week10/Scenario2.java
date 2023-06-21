package W.week10;

import java.util.Scanner;
public class Scenario2 {
     public static void main(String [] args ) {
        Scanner inp = new Scanner(System.in);
        String phone = "";
        String email = "";
        String name = "";
         String[] pool = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "x", "y", "z",
                 "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "Udemy", "X", "V", "Y", "Z",
                 "!", "'", "#", "+", "$", "%", "&", "/", "{", "(", "[", ")", "]","}", "?", "*", "-", "_"};
         String [] intpool = {"0","1","2","3","4","5","6","7","8","9"};
        while(true){
            boolean flag = false;
            System.out.print("Enter your phone number = ");
            phone = inp.nextLine();
            if(phone.length() != 11){
                System.out.println("Invalid phone number please write appropriately.");
                continue;
            }
            for(int i = 0; i< 64 ; i++) {
                if(phone.contains(pool[i])) {
                    flag = true;
                }
            }
            if(flag) {
                System.out.println("Invalid phone number please write appropriately.");
                continue;
            }
            else{
                break;
            }


        }
        while(true) {
            System.out.print("Enter an email = ");
            email = inp.nextLine();
            if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
                break;
            }else {
                System.out.println("Invalid email address please write appropriately");
            }
        }
        while(true) {
            boolean flag = false;
            System.out.print("Enter your name = ");
            name = inp.nextLine();
            for(int i = 0 ; i< 10; i++) {
                if(name.contains(intpool[i])) {
                    flag = true;
                }
            }
            if(flag) {
                System.out.println("Invalid name please write appropriately");
                continue;
            }else {break; }
        }

        System.out.println("Name = " + name + "\n"+
                "Phone number = " + phone + "\n"+
                "Email address = " + email );
    }

}
