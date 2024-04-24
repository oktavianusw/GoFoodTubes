package controller;

import model.Customer;
import model.Seller;
import model.Data_customer;
import model.Data_seller;

public class Wallet_controller {
    public static void view_balance(Customer cust) {
        System.out.println("Your Balance is: ");
        System.out.println("Rp" + cust.getBalance());
    }

    public static void top_up(Customer cust, int amount) {
        cust.increaseBalance(amount);
        System.out.println("Your Balance is: ");
        System.out.println("Rp" + cust.getBalance());
    }

    public static void transfer(Customer cust, String destination, int amount) {
        Customer customer = Data_customer.getCustomerbyEmail(destination);
        if (cust.getBalance() < amount) {
            System.out.println("Saldo tidak cukup.");
            return;
        }
        if (customer != null) {
            cust.decreaseBalance(amount);
            customer.increaseBalance(amount);
            System.out.println("Transfer Berhasil!");
            view_balance(cust);
            return;
        }
        Seller sell = Data_seller.getSellerbyEmail(destination);
        if (sell != null) {
            cust.decreaseBalance(amount);
            sell.addIncome(amount);
            System.out.println("Transfer Berhasil!");
            view_balance(cust);
        } else {
            System.out.println("User tidak ditemukan!");
        }
    }
}
