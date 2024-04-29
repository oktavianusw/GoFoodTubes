package model;

import java.util.ArrayList;
import java.util.Date;

public class Data_transaction {

    
    public static void addDummyCart() {
        
    }
    
    // public static void initTransactionData() {
        
    //     [] carts = new Cart[4];
    //     Data_seller dataSeller = new Data_seller();
    //     Seller[] sellers = Data_seller.sellers;

    //     // For each cart
    //     for (int i = 0; i < carts.length; i++) {
    //         ArrayList<Item> menu = sellers[i].getItems();

    //         // Skip this seller if they don't have any items
    //         if (menu.isEmpty()) {
    //             continue;
    //         }

    //         carts[i] = new Cart();

    //         carts[i].addItem(menu.get(0), 2);
    //         carts[i].addItem(menu.get(1), 1);
    //         carts[i].addItem(menu.get(2), 3);
    //         carts[i].addItem(menu.get(3), 1);
    //         System.out.println("Cart " + i + ": " + carts[i].getTotalPrice());
    //     }

    //     addDummyCart();

    //     Transaction[] transactions = {
    //             new Transaction(carts[0], "John Doe", "McDonald's", new Date(), "GoPay", (carts[0].getTotalPrice())),
    //             new Transaction(carts[1], "John Doe", "Starbucks", new Date(), "GoPay", (carts[1].getTotalPrice())),
    //             new Transaction(carts[2], "John Doe", "Subway", new Date(), "GoPay", (carts[2].getTotalPrice())),
    //             new Transaction(carts[3], "John Doe", "KFC", new Date(), "GoPay", (carts[3].getTotalPrice()))
    //     };

    //     Data_seller.sellers[0].addTransaction(transactions[0]);
    //     Data_seller.sellers[0].addIncome(transactions[0].getTotal());
    //     Data_seller.sellers[1].addTransaction(transactions[1]);
    //     Data_seller.sellers[1].addIncome(transactions[1].getTotal());
    //     Data_seller.sellers[2].addTransaction(transactions[2]);
    //     Data_seller.sellers[2].addIncome(transactions[2].getTotal());
    //     Data_seller.sellers[3].addTransaction(transactions[3]);
    //     Data_seller.sellers[3].addIncome(transactions[3].getTotal());
        
    //     Data_customer.cust[0].addTransaction(transactions[0]);
    //     Data_customer.cust[0].addTransaction(transactions[1]);
    //     Data_customer.cust[0].addTransaction(transactions[2]);
    //     Data_customer.cust[0].addTransaction(transactions[3]);
    // }
}