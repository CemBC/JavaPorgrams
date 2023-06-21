public class Pyramid {
    private String color;
    private Rectangle base;

    private  double height;
    private static int numberOfPyramid =0;
    public Pyramid() {
        this.color = "White";
        base = new Rectangle();
        this.height = 1;
        numberOfPyramid++;

    }

    public Pyramid(String color  , double height, double width, double length) {
        this.color = color;

        if(height < 0) {
            this.height = 1;
        }else{
            this.height = height;
        }

        base = new Rectangle(width,length);
        numberOfPyramid++;
    }

    public String getColor() { return color;}

    public double getHeight() { return height; }

    public void setColor(String color) { this.color = color;}

    public static int getNumberOfPyramid() { return numberOfPyramid;}
    public void setHeight(double height) {
        if(height < 0) {
            this.height = 1;
        }else{
            this.height = height;
        }
    }
    public double getVolume() {
        return (height* base.getArea())/(double)3;
    }

    public void printInfo() {
        System.out.println("Color = " + getColor() + "\nBase Area = " + base.getArea() + "\nVolume = " + getVolume() );
    }

}
