package B;

public class BubbleSwitch {
    public static void main(String [] args) {
        int[] arr = {12,31,2312,312,30,2,31,243,53,45,465,46};
        for(int i = 0 ; i < arr.length-1; i++) {
            boolean swapped = false;
            int temp = 0;
            for(int j = 0 ; j < arr.length-1 ; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) { break;}
        }
        for(int a : arr) {
            System.out.print(a+" ");
        }
    }
}
