package Udemy;

import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("************************************");
        String islemler = "1. Toplama işlemi\n"
                + "2. Çıkarma işlemi\n"
                + "3. Çarpma işlemi\n"
                + "4. Bölme işlemi";
        System.out.println(islemler);
        System.out.println("************************************");



        while (true) {
            System.out.print("Yapmak istediğiniz işlemi seçiniz:");
            int i = inp.nextInt();
            if (i == 1) {
                System.out.print("Birinci Sayı-");
                double a = inp.nextByte();
                System.out.print("İkinci Sayı-");
                double b = inp.nextByte();
                double c = a + b;
                System.out.println("Sonuç ="+c);
            } else if (i == 2) {
                System.out.print("Birinci Sayı-");
                double a = inp.nextByte();
                System.out.print("Çıkacak Olan İkinci Sayı-");
                double b = inp.nextByte();
                double c = a - b;
                System.out.println("Sonuç ="+c);
            } else if (i == 3) {
                System.out.print("Birinci Sayı-");
                double a = inp.nextByte();
                System.out.print("İkinci Sayı-");
                double b = inp.nextByte();
                double c = a * b;
                System.out.println("Sonuç ="+c);
            } else if (i == 4) {
                System.out.print("Bölünen Sayı-");
                double a = inp.nextByte();
                System.out.print("Bölen Sayı-");
                double b = inp.nextByte();
                double c = a / b;
                System.out.println("Sonuç ="+c);
            } else {
                System.out.println("Yanlış işlem girdiniz...");
            }
        }
    }
}
