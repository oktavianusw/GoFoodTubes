package model;

public class OrderDetail {
    private Item item;
    private int quantity;
    
    public OrderDetail(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    

    
}
