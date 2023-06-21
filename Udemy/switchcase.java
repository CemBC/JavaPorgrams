package Udemy;

import java.util.Scanner;
public class switchcase {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen işlemi giriniz:");
        int a = inp.nextInt();
        switch(a) {
            case 1:
                System.out.println("İşlem:\t"+a);
                break;
            case 2:
                System.out.println("İşlem:\t"+a);
                break;
            case 3:
                System.out.println("İşlem:\t"+a);
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
    }
}
