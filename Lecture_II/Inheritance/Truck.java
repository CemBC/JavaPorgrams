package Lecture_II.Inheritance;



public class Truck extends Vehicle {
    private boolean hasDumper;

    public Truck() {
        super();
        this.hasDumper = false;
    }
    public Truck(String model , int price , boolean hasDumper) {
        super(model,price);
        this.hasDumper = hasDumper;
    }

    public boolean getDumper() { return hasDumper;}

    public void display() {
        super.display();
        System.out.println("Has a Dumper = " + getDumper());
    }
}
