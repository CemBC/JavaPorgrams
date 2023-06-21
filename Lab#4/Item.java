public class Item {
    private Product product;
    private  int ItemID;
    private int quantity;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item() {
        this.ItemID = -1;
        this.quantity = -1;
        this.product = null;
    }

    public Item(int ID , int quantity , Product product) {
        this.ItemID = ID;
        this.quantity = quantity;
        this.product = product;
    }

    public double ProductsPrice() {
        return product.getPrice()*quantity;
    }
}
