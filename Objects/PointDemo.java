package Objects;

public class PointDemo {
    public static void main(String [] args) {
        Point a = new Point(4,0);
        Point b = new Point(0,12);


        System.out.println(a.distanceTo(b));
        b.ShowValue();


        a.ShowValue();
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.getMiddle(b).ShowValue();


    }
}
