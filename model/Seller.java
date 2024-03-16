package model;

public class Seller extends User {
    private double income;
    public Seller(int userId, String username, String email, String password, UserType userType, double income) {
        super(userId, username, email, password, userType);
        this.income = income;
    }
}
