package model;

public class Seller extends User {
    private double income;
    //nama toko
    public Seller(int userId, String username, String email, String password, UserType userType) {
        super(userId, username, email, password, userType);
        this.income = 0;
    }
}
