package model;

public class Customer extends User {
    private Cart cart;

    public Customer(int userId, String username, String email, String password, UserType userType, double wallet, Cart cart) {
        super(userId, username, email, password, userType);
        this.cart = new Cart();
    }



    public Cart getCart() {
        return cart;
    }
}