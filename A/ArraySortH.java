package A;
import java.util.Random;

public class ArraySortH {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        // Generate an array of size 50, then use Random r to create
        // random values.
        int[] arr = new int[50];
        for(int i=0;i<arr.length;i++) {
            // the values should be between 1 and 1000
            arr[i] = r.nextInt(1000) + 1;
            // print the values so that we can see them.
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] empty = new int[50];
        for(int i=0;i<arr.length;i++) {
            // The min method returns the minimum in the array
            // however, there is a catch. Once we find the minimum,
            // we don't want that value to be the minimum next time
            // we call this method. So, since we know that the max
            // value is 1000, we modify the value in the array.
            // This is not a good approach, but gets the job done
            // in this case.
            empty[i] = min(arr);
            System.out.print(empty[i] + " ");
        }
        System.out.println();
    }
    public static int min(int arr[]) {
        // m stores the minimum value, we assign it to the first
        // element at the beginning.
        int m = arr[0];
        // we need the index of the minimum value, so we also use
        // a variable to store its location. Once the loop is over,
        // we will update the value in this (idx) location.
        int idx = 0;
        for(int i=0;i<arr.length;i++) {
            if(m > arr[i]) {
                // if arr[i] is smaller than minimum, then update.
                m = arr[i];
                // store the location
                idx = i;
            }
        }
        // at this point m stores the minimum value, idx stores its
        // location in the array. We will update that value so
        // that it will not be the minimum once this method is called
        // again.
        arr[idx] += 1000;
        return m;
    }
}
