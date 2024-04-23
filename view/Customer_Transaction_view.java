package view;

import model.Transaction;
import model.Customer;

public class Customer_Transaction_view {
    public static void history(Customer cust) {
        System.out.println("========================");
        System.out.println("\tTransaction History");
        System.out.println("========================");
        if (cust.getTransactions().isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction transaction : cust.getTransactions()) {
                System.out.println(transaction);
            }
        }
    }
}
