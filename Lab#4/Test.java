import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Product chocolate = new Product(2131 , "chocolate" , "White" , 3.45 , "White chocolate with coconut");
        Product toyTruck = new Product(1453 , "Toy Truck" , "Orange" , 15 , "Toy truck for kids and mans who are never gets old");
        Product brush = new Product(1071 , "Brush" , "Purple" , 5 , "Simple hari brush");
        Product mouse = new Product(1234 , "Logitech G733" , "Black" , 49.99 , "Wireless Gaming Mouse");
        Product keywboard = new Product(9876 , "Inca Keyboard", "Grey" , 35.5 , "Wireless Gaming KeyBoard");
        Product monitor = new Product(0000 , "Omen" , "Blue" , 100 , "HP 165hz Monitor");

        Item ItemChocolote = new Item(2131 , 140 , chocolate);
        Item ItemtoyTruck = new Item(1453 , 5 , toyTruck);
        Item ItemBrush = new Item(1071 , 30 , brush);
        Item Itemmouse = new Item(1234 , 3 , mouse);
        Item Itemkeyboard = new Item(9876 , 1 , keywboard);
        Item Itemmonitör = new Item(0000 , 1 , monitor);


        ArrayList<Item> itemList1 = new ArrayList<Item>();
        itemList1.add(ItemBrush);
        itemList1.add(Itemmouse);
        ArrayList<Item> itemList2 = new ArrayList<Item>();
        itemList2.add(Itemkeyboard);
        itemList2.add(ItemtoyTruck);
        ArrayList<Item> itemList3 = new ArrayList<Item>();
        itemList3.add(ItemChocolote);
        itemList3.add(Itemmonitör);
        Order order1 = new Order(6 , itemList1 , 12332145);
        System.out.println("Number of orders = " + Order.getNumberOfOrders());
        Order order2 = new Order(12 , itemList2 , 2135687543);
        System.out.println("Number of orders = " + Order.getNumberOfOrders());
        Order order3 = new Order(9 , itemList3 , 213495806);
        System.out.println("Number of orders = " + Order.getNumberOfOrders());


        ArrayList<Order> OrderList = new ArrayList<Order>();
        OrderList.add(order1);
        OrderList.add(order2);
        OrderList.add(order3);
        double maxPrice = Double.MIN_VALUE;
        int minQuant = Integer.MAX_VALUE;
        int maxInsta = Integer.MIN_VALUE;
        for(int i = 0 ; i < OrderList.size() ; i++) {
            if(OrderList.get(i).getInstalmentCount() > maxInsta) {
                maxInsta = OrderList.get(i).getInstalmentCount();
            }
            for(int k = 0 ; k < OrderList.get(i).getItemList().size() ; k++) {
                if(maxPrice < OrderList.get(i).getItemList().get(k).getProduct().getPrice()){
                    maxPrice = OrderList.get(i).getItemList().get(k).getProduct().getPrice();
                }if(minQuant >  OrderList.get(i).getItemList().get(k).getQuantity()){
                    minQuant =  OrderList.get(i).getItemList().get(k).getQuantity();
                }
            }
        }

        System.out.println("MAX PRICE = " + maxPrice + "\nMIN QUANTITY = " + minQuant + "\nMAX INSTALMENT COUNT = " + maxInsta);

    }
}
