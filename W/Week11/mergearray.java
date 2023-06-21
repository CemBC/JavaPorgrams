package W.Week11;

public class mergearray {
    public static int[] merge(int[] arr1, int[]arr2) {
        int[] mergedarray = new int[arr1.length*2];

        int temp = 0;

        for(int i = 0 ; i < arr1.length ; i++) {
            for(int j = 0; j < mergedarray.length ; j++) {
                if (mergedarray[j] == 0) {
                    temp = j;
                    break;
                }
            }
            if(arr1[i] > arr2[i]) {
                mergedarray[temp] = arr2[i];
                mergedarray[temp + 1] = arr1[i];
            }
            else {
                mergedarray[temp] = arr1[i];
                mergedarray[temp + 1] = arr2[i];

            }





        }
        return mergedarray;
    }


    public static void main(String [] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {4,10,7};
        for(int a : merge(arr1,arr2)) {
            System.out.println(a);
        }
    }


}


