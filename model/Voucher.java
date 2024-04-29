package model;

public class Voucher {
    double DiscountPercentage;
    int quantity;

    public Voucher(double discountPercentage, int quantity) {
        DiscountPercentage = discountPercentage;
        this.quantity = quantity;
    }
    
    public double getDiscountPercentage() {
        return DiscountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        DiscountPercentage = discountPercentage;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return "Voucher Discount " + DiscountPercentage + "%";
    }
    
}
