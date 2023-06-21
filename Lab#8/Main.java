import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArithmeticOperation op1 = new ArithmeticOperation(enterValue());
        ArithmeticOperation op2 = new ArithmeticOperation(enterValue());
        ArithmeticOperation op3 = new ArithmeticOperation(enterValue());
        ArithmeticOperation op4 = new ArithmeticOperation(enterValue());
        System.out.println(op1.add());
        System.out.println(op2.substract());
        System.out.println(op3.multiply());
        System.out.println(op4.divide());
    }

    public static  int[] enterValue() {
        ArithmeticOperation op;
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(true) {
            try {
                System.out.print("Enter first number = ");
                a = Integer.parseInt(sc.nextLine());
                System.out.print("Enter secon number = ");
                b = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e) {
                System.out.println("Please enter an integer");

            }
        }
        int[] operands = {a,b};
        op = new ArithmeticOperation(operands);
        return operands;
    }
}
