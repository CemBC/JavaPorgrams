package W.Week6;

public class Exercise2 {
    public static void main(String [] args){
        System.out.println(recursivelyCalculate(17));
    }
    private static int recursivelyCalculate(int i) {
        if(i < 1){return 1;}
        else if(i > 1 && i < 4){return i + recursivelyCalculate(i-1);}
        else{return i - recursivelyCalculate(i/2);}
    }
}
 /*
 17 - ( 8 - ( 4 - ( 2 + (1 - 1) ) ) ) = 11
  */