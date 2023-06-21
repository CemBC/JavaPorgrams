package A;
import java.util.Random;
public class TekArraySort{
    public static void main(String[] args) {
        Random rd = new Random(System.currentTimeMillis());
        int[] arr = new int[50];


        for(int i = 0 ; i <arr.length; i++){
            arr[i] = rd.nextInt(1001);
            System.out.println(arr[i]);
        }

        System.out.println("____");
        System.out.println();

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(sorting(arr)[i]);
        }
    }



    public static int[] sorting(int[] arr){
        int temp;//temporary value for switching indexes
        int th=0; // tha value that will be minimum index's path
        for(int j = 0 ; j <arr.length ; j++){
	        /*looks ındex 0,1,2...
	        then looks 1,2,3...
	        then looks 2,3.... */

            int min = 1001;

            for(int i = j ; i < arr.length; i++){
                // finding minimum ındex and ıt's value
                if(arr[i] < min){
                    min = arr[i];
                    th = i;

                }

            }
            temp = arr[j];// storage ındex j to not losing value while switching
            arr[j] = min;
            arr[th]= temp;




        }
        return arr;

    }

}