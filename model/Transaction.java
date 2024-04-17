package model;

import java.util.Date;

public class Transaction {
    private static int counter = 0;
    private String orderID;
    private Date createdAt;
    private String paymentMethod;
    private double total;

    public Transaction(Customer customer, Date createdAt, String paymentMethod, double total) {
        this.orderID = "Order" + (++counter);
        this.createdAt = createdAt;
        this.paymentMethod = paymentMethod;
        this.total = total;
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
}