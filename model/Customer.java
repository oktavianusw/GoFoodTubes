package model;

import java.util.ArrayList;

public class Customer extends User {
    private Cart cart;
    private double balance;
    private ArrayList<Voucher> vouchers;
    private ArrayList<Transaction> transactions;
    
    public Customer(int userId, String username, String email, String password, UserType userType, double balance, Cart cart) {
        super(userId, username, email, password, userType);
        this.cart = new Cart();
        this.balance = balance;
        this.vouchers = new ArrayList<Voucher>();
        this.transactions = new ArrayList<Transaction>();
    }

    public Cart getCart() {
        return cart;
    }

    public double getBalance() {
        return balance;
    }
    public void decreaseBalance(double amount) {
        this.balance -= amount;
    }

    public void increaseBalance(double amount) {
        this.balance += amount;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}