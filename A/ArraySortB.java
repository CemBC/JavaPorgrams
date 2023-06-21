package A;
import java.util.Random;
public class ArraySortB {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        int[] arr = new int[50];
        for(int i = 0 ; i < arr.length; i ++) {
            arr[i] = rd.nextInt(1001);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int[] empty = new int[50];
        for(int i = 0; i< arr.length; i++) {
            empty[i] = min(arr);
            System.out.print(empty[i]+ "\t");
        }
    }
    public static int min(int[] arr) {
        int min = 1001;
        for(int i = 0 ; i< arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

        }
        for(int i = 0; i < arr.length; i++) {
            if(min == arr[i]){
                arr[i] = 1000;
                break;
            }
        }


        return min;
    }
}
