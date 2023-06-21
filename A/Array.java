package A;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
     public static void Array(int[] array) {
        for ( int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void ortalama(int[] array) {
        int sum = 0;
        for( int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println((double)sum/(double)array.length);
    }




    public static void main(String [] args ) {
        int[] a = {1,2,3,4,5};
        Array(a);
        ortalama(a);
     }
    public static int[] Array_doldurma() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Length  = ");
        int sayı = inp.nextInt();
        int[] a = new int[sayı];
        for ( int i = 0; i < sayı; i ++) {
            a[i] = inp.nextInt();

        }
        return a;
    }
    public static void array_bastır(int [] array) {
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("array["+i+"] = "+ array[i]);
        }
    }



    public static void main2(String [] args) {
        int [] a1= {1,2,3};
        int [] a2 = {1,2,3};
        if(Arrays.equals(a1,a2)) {
            System.out.println("Eşitler");
        }else {
            System.out.println("Eşit değiller");
        }

    }
    public static void array_sort(int [] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }


        public static void main3(String [] args){
            int[] array = {1, 2, 3};
            int mult = 1;
            for (int a : array) {
                mult *= a;
            }
            System.out.println(mult);
        }



        public static void equal(String [] args) {
         int[] a = {1,2,3,4};
         int[] b = {1,2,3,4};
         if(a.equals(b)){
             System.out.println("A");
         }
        }
    }



