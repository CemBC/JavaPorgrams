package Objects;

import java.util.Random;
import java.util.Scanner;
public class  ItemDemo {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        Item [] tems = new Item[100];
        for(int i = 0 ; i < 100 ; i ++){
            int p = rd.nextInt(1001);
            tems[i] = new Item(p);
        }
        int sum = 0;
        int index = 1000;
        while(true){
            System.out.print("Enter the ıtem index = ");
            index = inp.nextInt();
            if(index < 0){ break;}
            sum += tems[index].getPrice();
        }
        System.out.println("Your cost is = " + sum);
    }
}