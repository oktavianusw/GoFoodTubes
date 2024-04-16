package model;

import java.util.Date;
import java.util.ArrayList;

public class Order {
    private String Order_ID;
    private Date Created_at;
    private OrderStatus Order_status;
    private ArrayList<OrderDetail> orderDetails;
    
    public Order(String order_ID, Date created_at, OrderStatus order_status, ArrayList<OrderDetail> orderDetails) {
        Order_ID = order_ID;
        Created_at = created_at;
        Order_status = order_status;
        this.orderDetails = orderDetails;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String order_ID) {
        Order_ID = order_ID;
    }

    public Date getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(Date created_at) {
        Created_at = created_at;
    }

    public OrderStatus getOrder_status() {
        return Order_status;
    }

    public void setOrder_status(OrderStatus order_status) {
        Order_status = order_status;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (OrderDetail orderDetail : orderDetails) {
            totalPrice += orderDetail.getItem().getPrice() * orderDetail.getQuantity();
        }
        return totalPrice;
    }
}