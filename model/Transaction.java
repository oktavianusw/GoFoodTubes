package model;

import java.util.Date;

public class Transaction {
    private static int counter = 0;
    private String orderID;
    private Date createdAt;
    private String paymentMethod;
    private double total;
    private Cart cart;

    private String storeName;

    public Transaction(Cart cart, String storeName, Date createdAt, String paymentMethod, double total) {
        this.cart = new Cart();
        if (cart != null) {
            this.cart.fillWithOldCart(cart);
        }
        this.orderID = "Order" + (++counter);
        this.storeName = storeName;
        this.createdAt = createdAt;
        this.paymentMethod = paymentMethod;
        this.total = total;
    }

    public String getStoreName() {
        return storeName;
    }
    public String getOrder_ID() {
        return orderID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getTotal() {
        return total;
    }

    public static int getCounter() {
        return counter;
    }



    public static void setCounter(int counter) {
        Transaction.counter = counter;
    }



    public String getOrderID() {
        return orderID;
    }



    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }



    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }



    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }



    public void setTotal(double total) {
        this.total = total;
    }



    public Cart getCart() {
        return cart;
    }



    public void setCart(Cart cart) {
        this.cart = cart;
    }
}