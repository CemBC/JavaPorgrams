package Udemy;

import java.util.Scanner;
public class faktöriyelfor{
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir değer giriniz:");
        int i = inp.nextInt();
        int son = 1;
        for (; i != 1; i--) {
            son = son* i;



        }
        System.out.println("Girdiğiniz sayının faktöriyeli="+son);
    }
}
