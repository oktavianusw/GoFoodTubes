package view;

import model.Customer;

public class Customer_profile {

    public static void showProfile(Customer cust) {
        System.out.println("=============================");
        System.out.println("\tCustomer Profile");
        System.out.println("=============================");
        System.out.println("Username: " + cust.getUsername());
        System.out.println("Email: " + cust.getEmail());
        System.out.println("Wallet: " + cust.getWallet());
    }
}