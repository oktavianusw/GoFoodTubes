package model;

public class Food {
    private int id;
    private String name;
    private double price;
    private double discountPercentage;
    private Rating rating;

    public Food(int id, String name, double price, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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