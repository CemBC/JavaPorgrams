package Udemy;

import java.util.Scanner;
public class rakamlarıtoplamı {
    public static void main(String [] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Sayıyı giriniz:");
    int sayı = inp.nextInt();
    int toplam = 0;
    do {
        toplam += sayı % 10;
        sayı = sayı /10;

    } while (sayı > 0 );
        System.out.println("Rakamları toplamı = "+ toplam);



    }
}
