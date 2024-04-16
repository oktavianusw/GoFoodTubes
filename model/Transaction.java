package model;

import java.util.Date;

public class Transaction {
    
    private int Transaction_ID;
    private Order Order_ID;
    private Date createdAt;
    private String paymentMethod;
    private double total;

    public Transaction(int transaction_ID, Order order_ID, Date createdAt, String paymentMethod, double total) {
        Transaction_ID = transaction_ID;
        Order_ID = order_ID;
        this.createdAt = createdAt;
        this.paymentMethod = paymentMethod;
        this.total = total;
    }
    
    public int getTransaction_ID() {
        return Transaction_ID;
    }
    public void setTransaction_ID(int transaction_ID) {
        Transaction_ID = transaction_ID;
    }
    public Order getOrder_ID() {
        return Order_ID;
    }
    public void setOrder_ID(Order order_ID) {
        Order_ID = order_ID;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    
    
}