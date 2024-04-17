package model;

import java.util.ArrayList;

public class Seller extends User {
    private double income;
    private String storeName;
    private ArrayList<Item> items;

    public Seller(int userId, String username, String email, String password, UserType userType, String storeName, ArrayList<Item> items) {
        super(userId, username, email, password, userType);
        this.income = 0;
        this.storeName = storeName;
        this.items = items;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void addIncome(double income) {
        this.income += income;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
