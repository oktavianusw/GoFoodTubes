package controller;

import model.Customer;

public class Wallet_controller {

    public static Customer cust;
    public static void view_balance(Customer cust){
        System.out.println("Your Balance is: ");
        System.out.println("Rp" + cust.getWallet());
    }

    public static void top_up(Customer cust, int amount){
        cust.increaseWallet(amount);
    }
    public static void transfer(Customer cust, int amount){

        cust.getClass().getDeclaredField("wallet") cust.getWallet() - amount;
    }
}
