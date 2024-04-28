package model;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
    private double income;
    private String storeName;
    private ArrayList<Item> items;
    private ArrayList<Rating> ratings;
    private List<Transaction> transactionsHistory = new ArrayList<Transaction>();

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

    public List<Transaction> getTransactions() {
        return transactionsHistory;
    }

    public void addTransaction(Transaction transaction) {
        transactionsHistory.add(transaction);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
