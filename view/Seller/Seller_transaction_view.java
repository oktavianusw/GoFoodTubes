package view.Seller;

import model.Customer;
import model.Seller;
import model.Item;
import model.Transaction;
import view.Customer.Customer_menu;

import java.io.IOException;
import java.util.Scanner;

public class Seller_transaction_view {

    public static Scanner input = new Scanner(System.in);
    public static void displayTransactionHistory(Seller seller) throws IOException {
        String store = seller.getStoreName();
        System.out.println("Transaction History for " + store + ":");
        if (seller.getTransactions().isEmpty()) {
            System.out.println("No transactions found.");
        }else{
            for (Transaction transaction : seller.getTransactions()) {
                if (transaction.getStoreName().equalsIgnoreCase(store)) {
                    System.out.println("Transaction ID: " + transaction.getOrderID());
                    System.out.println("Date: " + transaction.getCreatedAt());
                    System.out.println("Customer: " + transaction.getCustName());
                    System.out.println("Payment Method: " + transaction.getPaymentMethod());
                    System.out.println("Total Price: " + transaction.getTotal());
                    System.out.println("Items:");
                    for (Item item : transaction.getCart().getItems().keySet()) {
                        double rate = item.getRating().getPersonalRate();
                        String comment = item.getRating().getComment();
                        if (rate != 0) {
                            System.out.println(
                                    "Item ID : " + item.getItem_ID() + ", Name: " + item.getItem_name() + ", Price: "
                                            + item.getPrice() + "$, Quantity: " + transaction.getCart().getItems().get(item)
                                            + ", Rating: " + rate + ", Comment: " + comment);
                        } else {
                            System.out.println(
                                    "Item ID : " + item.getItem_ID() + ", Name: " + item.getItem_name() + ", Price: "
                                            + item.getPrice() + "$, Quantity: " + transaction.getCart().getItems().get(item)
                                            + ", Rating: Not rated yet");

                        }
                    }
                }
                System.out.println("====================================");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Choose menu :");
        System.out.println("0. Back");

        System.out.println("Choose : ");
        int choose = input.nextInt();

        switch (choose) {
            case 0:
                Seller_menu.seller_menu(seller);
                break;
        }
    }
}
