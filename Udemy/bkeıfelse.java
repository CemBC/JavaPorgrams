package Udemy;

import java.util.Scanner;
public class bkeıfelse {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz:");
        int kilo = inp.nextInt();
        System.out.print("Boyunuzu santimetre cinsinden giriniz:");
        float boy = inp.nextInt();
        boy = boy / 100.f;
        double bke = kilo / (boy*boy);
        System.out.println("Beden kitle endeksiniz:"+bke);
        if ( bke < 18.5) {
            System.out.println("Zayıf grubundasınız...");
        } else if (bke < 25.0) {
            System.out.println("Normal grubundasınız...");
        } else if (bke < 30) {
            System.out.println("Fazla kilolu grubundasınız...");
        } else {
            System.out.println("Obez grubundasınız...");
        }

    }
}
