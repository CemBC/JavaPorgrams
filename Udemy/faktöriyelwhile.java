package Udemy;

import java.util.Scanner;

public class faktöriyelwhile {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı = inp.nextInt();
            int fak = 1;
            while (sayı > 1) {
                fak = fak * sayı;
                sayı--;

            }
            System.out.println("Sayının faktöriyeli = " + fak);

        }
    }
}
