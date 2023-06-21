import java.util.*;
public class Order {
    private int OrderID;
    private ArrayList<Item> itemList;
    private double totalPrice = 0;
    private int instalmentCount;

    private static int numberOfOrders = 0;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getInstalmentCount() {
        return instalmentCount;
    }

    public void setInstalmentCount(int instalmentCount) {
        this.instalmentCount = instalmentCount;
    }

    public Order() {
        this.instalmentCount = -1;
        this.itemList = null;
        this.OrderID = -1;
        this.totalPrice = 0;
    }

    public Order(int instalmentCount , ArrayList<Item> ıtemList , int OrderID ) {
        this.itemList = ıtemList;
        this.OrderID = OrderID;
        this.instalmentCount = instalmentCount;
        for(Item a : itemList) {
            this.totalPrice += a.ProductsPrice();
        }
        this.numberOfOrders += 1;
    }

    public void OrdeInfo() {
        System.out.println("OrderID = " + OrderID + "\nInstalment count = " + instalmentCount + "\nTotal price = " + totalPrice);
        System.out.println("--------");
        for(Item a : itemList) {
            a.getProduct().Info();
            System.out.println("---------");
        }
    }

    public static int getNumberOfOrders() {
        return numberOfOrders;
    }
}
