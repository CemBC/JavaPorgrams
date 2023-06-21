
public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width , double length) {
        if(width < 0 ) {
            this.width = 1;
        }else {
            this.width = width;
        }if(length < 0) {
            this.length = 1;
        }else {
            this.length = length;
        }
    }

    public double getWidth() { return width;}
    public double getLength() { return length;}

    public void setWidth(double width) {
        if(width < 0 ) {
            this.width = 1;
        }else {
            this.width = width;
        }
    }
    public void setLength(double length) {
        if(length < 0) {
            this.length = 1;
        }else {
            this.length = length;
        }
    }

    public double getArea() {
        return width*length;
    }


}
