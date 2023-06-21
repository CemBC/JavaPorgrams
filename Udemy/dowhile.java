package Udemy;

import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int grade = 0;
        System.out.println("Enter a negative grade to stop entering grades.");
        do {
            System.out.print("Enter the grade for student " + (num + 1) + ": ");
            grade = sc.nextInt();
            if (grade >= 0) {
                sum += grade;
                num++;
            }
        } while (grade >= 0);
        System.out.println((float) sum / (float) num);
    }
}
