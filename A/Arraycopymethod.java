package A;

public class Arraycopymethod {
    public static void main(String [] args) {
        int[] ars = {1,2,3,4,5,6};
        int[] copy = new int [10];
        System.arraycopy(ars, 0 , copy , 0, ars.length);
        for(int i = 0; i < copy.length; i ++ ){
            System.out.print(copy[i]+ "\t");
        }
    }
}

// System.arraycopy(--[Aktarılacak olan array]--,--[Aktarılmanın başlangıç indexi]--,--[Aktarılan konum olan array]--,--[konumun başlangıç indexi]--,--[aktarılma uzunluğu]--);
