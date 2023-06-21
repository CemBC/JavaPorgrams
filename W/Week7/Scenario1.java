package W.Week7;

public class Scenario1 {
    public static void main(String [] args) {
        int tempvalue; //temporary value that keep the value to not lost
        int first = 12;
        int seccond = 4;
        System.out.println("First number is = " + first + "\n" +
                "Second number is = " + seccond );
        tempvalue = first;
        first = seccond;
        seccond = tempvalue;
        System.out.println();
        System.out.println("First number is = " + first + "\n" +
                "Second number is = " + seccond );
    }
}
