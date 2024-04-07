package controller;

import model.Customer;
import model.Data_customer;

public class Wallet_controller {
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
            System.out.println("Transfer Berhasil!");
            view_balance(cust);
        }else{
            System.out.println("User tidak ditemukan");
        }
    }
}
