package model;

public class Customer extends User {

    private double wallet;

    public Customer(int userId, String username, String email, String password, UserType userType) {
        super(userId, username, email, password, userType);
        this.wallet = 0;
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
    
    
}
