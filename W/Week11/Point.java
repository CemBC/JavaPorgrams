package W.Week11;

public class Point{
    private int x;
    private int y;
    private int z;

    public Point(int x, int y , int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    public double distanceTo(Point b) {
        double dis = Math.sqrt(Math.pow(x-b.x,2) + Math.pow(y-b.y,2) + Math.pow(z-b.z,2));
        return dis;
    }
}
