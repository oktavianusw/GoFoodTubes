package model;

public class Customer extends User {
    private double wallet;
    private Cart cart;

    public Customer(int userId, String username, String email, String password, UserType userType, Cart cart) {
        super(userId, username, email, password, userType);
        this.wallet = 0;
        this.cart = new Cart();
    }

    public double getWallet() {
        return wallet;
    }

    public void decreaseWallet(double amount) {
        this.wallet -= amount;
    }

    public void increaseWallet(double amount) {
        this.wallet += amount;
    }

    public Cart getCart() {
        return cart;
    }
}