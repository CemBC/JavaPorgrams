package Objects;

public class NumberDemo {
    public static void main(String [] args) {
        Number a = new Number(3,4);
        Number b = new Number(5,8);
        System.out.println(a.Add(b));
        System.out.println(a.Divide(b));
        System.out.println(a.Mult(b));
        System.out.println(a.Sub(b));

    }
}
