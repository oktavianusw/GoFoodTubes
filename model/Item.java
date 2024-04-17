package model;

public class Item {
    private int Item_ID;
    private String Item_name;
    private double price;
    private int stock;
    private double discountPercentage;
    
    public Item(int item_ID, String item_name, double price, int stock, double discountPercentage) {
        Item_ID = item_ID;
        Item_name = item_name;
        this.price = price;
        this.stock = stock;
        this.discountPercentage = discountPercentage;
    }

    public int getItem_ID() {
        return Item_ID;
    }
    public void setItem_ID(int item_ID) {
        Item_ID = item_ID;
    }
    public String getItem_name() {
        return Item_name;
    }
    public void setItem_name(String item_name) {
        Item_name = item_name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountedPrice() {
        return price - (price * discountPercentage);
    }

}
