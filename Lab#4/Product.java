public class Product {
    private int ID;
    private String name;
    private double price;
    private String color;
    private String description;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product() {
        this.ID = -1;
        this.name = "Not specified";
        this.color = "Not specified";
        this.price = -1;
        this.description = "Not specified";
    }

    public Product(int ID , String name , String color , double price , String description) {
        this.ID = ID;
        this.name = name;
        this.color = color;
        this.price = price;
        this.description = description;
    }

    public void Info(){
        System.out.println("ID = " + ID + "\nName = " + name + "\nColor = " + color + "\nPrice = " + price + "\nDescription = " +description);
    }
}
