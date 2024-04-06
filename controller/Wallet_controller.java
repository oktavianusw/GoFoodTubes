package controller;

import model.Customer;
import model.Data_customer;
import model.User;

public class Wallet_controller {

    public static Customer cust;
    public static void view_balance(Customer cust){
        System.out.println("Your Balance is: ");
        System.out.println("Rp" + cust.getBalance());
    }

    public static void top_up(Customer cust, int amount){
        cust.increaseBalance(amount);
    }
    public static void transfer(Customer cust, String destination, int amount){
        cust.decreaseBalance(amount);
        Customer user = Data_customer.getUserbyEmail(destination);
        if(user != null){
            user.increaseBalance(amount);
        }
    }
}
