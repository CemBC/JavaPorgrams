package A;

public class Arraycopyamele {
    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] huge = new int[10];
        for(int i = 0; i < arr.length; i ++ ) {
            huge[i] = arr[i];
        }
        for(int i = 0 ; i < huge.length; i ++) {
            System.out.print(huge[i] + "\t");
        }
        }
    }

