/*
* Author: Ilker Korkmaz
*/

public class Box {
    private String color;
    private double length; // non-static data members will be owned by each instance defined in memory
    private double volume; 
	/* 
	As mentioned in the question, "volume" is required as a data member.
	However, as an alternative design, the volume is not necessary to be used as a data member, the volume value can be computed on demand using "length".
	*/
    private static int numberOfBoxes = 0;  // static data members are shared by the class, not owned by an instance

    public Box() { // constructor
        System.out.println("Constructor with no parameters runs...");
        this.setColor("NO_COLOR");
        this.setLength(0.1);
        this.calculateVolume();
        numberOfBoxes++;
    }

    public Box(String myColor, double myLength) { // constructor overloaded
        System.out.println("Constructor with two parameters runs...");
        this.setColor(myColor);  // "setColor(myColor);" is same
        setLength(myLength);
        this.calculateVolume();
        numberOfBoxes++;
    }

    public String getColor() {
        return color ; // return this.color;
    }

    public void setColor(String myColor) {
        this.color=myColor;  // color=myColor;
        return; // return is unnecessary here
    }

    public double getLength() {
        return this.length; // return length;
    }

    public void setLength(double myLength) {
        if(myLength<=0.0) // validation mechanism for length: length must have a positive value
            myLength=0.1;

        length=myLength;  // this.length=myLength;
        //return;
    }

    public void calculateVolume() {
        volume = length*length*length;
    }

    public static int getNumberOfBoxes() { // static methods deal with static data members
        return numberOfBoxes;
    }

    /* since numberOfBoxes is automatically computed, no need to implement setNumberOfBoxes()
    static void setNumberOfBoxes(int nob)
    {
        if(nob<0)  // the number of boxes can not be negative
            nob=0;

        numberOfBoxes = nob;
    }
    */

    public double getVolume(){
        return volume;
    }

    public void display(){
        System.out.println("CUBIC BOX INFO");
        System.out.println("-------------------");
        System.out.println("COLOR              : " + color);
        System.out.printf ("LENGTH OF AN EDGE  : %.1f \n" , getLength());
        System.out.printf ("VOLUME             : %.3f \n" , this.volume);
        System.out.println();
    }
}