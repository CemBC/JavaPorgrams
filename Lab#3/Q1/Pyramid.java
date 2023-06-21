public class Pyramid {
    private String color;
    private  double length;
    private double width;
    private  double height;

    public Pyramid() {
        this.color = "White";
        this.length = 1;
        this.width = 1;
        this.height = 1;

    }

    public Pyramid(String color , double length , double width , double height) {
        this.color = color;
		if(length < 0 ) {
			this.length = 1;
		}else{
			this.length = length;
		}
		if(width < 0) {
			this.width = 1;
		}else{
			this.width = width;
		}if(height < 0) {
			this.height = 1;
		}else{
			this.height = height;
		}
    }

    public String getColor() { return color;}
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public void setColor(String color) { this.color = color;}
    public void setLength(double length){
		if(length < 0 ) {
			this.length = 1;
		}else{
			this.length = length;
		}
	}
    public void setWidth(double width) {
		if(width < 0) {
			this.width = 1;
		}else{
			this.width = width;
		}
	}
    public void setHeight(double height) {
		if(height < 0) {
			this.height = 1;
		}else{
			this.height = height;
		} 
	}
    public double getVolume() {
        return (length*width*height)/(double)3;
    }
    public void showInfo() {
        System.out.println("Color = " + getColor() + "\nLength = " + getLength() +
                "\nWidth = " + getWidth() + "\nHeight = " + getHeight() + "\nVolume = " +getVolume());
    }
}
