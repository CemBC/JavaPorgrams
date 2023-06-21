package Lecture_II.Inheritance;

public class Vehicle {
    private String model;
    private int price;

    public Vehicle() {
        model = "Not stated";
        price = 0;
    }

    public Vehicle(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() { return model;}
    public int getPrice() { return price;}

    public void setModel(String model) {this.model = model;}
    public void setPrice(int price) {this.price = price;}

    public void display(){
        System.out.println("The Car Model = "  + getModel() + "\n"
        + "The Car Price = " + getPrice());
    }


}
