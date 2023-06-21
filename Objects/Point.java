package Objects;

import java.util.MissingFormatArgumentException;

public class Point {
    private double x ;
    private double y;
    public  Point(double a, double b) {
        x = a;
        y = b;
    }

    public Point() {

    }

    public void ShowValue() {
        System.out.println( "X = " + x + "\n" + "Y = " + y);
     }
     public void setX(int a){ x = a;}
    public void setY(int b) { y = b;}
    public double getX() { return x;}
    public double getY(){ return y;}

     public double distanceTo(Point c) {
        double dx = Math.pow(x- c.x,2);
        double dy = Math.pow(y-c.y,2);
        return Math.sqrt(dx+dy);
     }
    public Point getMiddle( Point b) {
        double c = (x + b.x )/ 2;
        double d = (y + b.y) / 2;
        Point m = new Point(c,d);
        return m;

    }


}
