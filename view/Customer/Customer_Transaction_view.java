package view.Customer;

import model.Transaction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Customer;
import model.Item;

public class Customer_Transaction_view {
    public static Scanner input = new Scanner(System.in);

    public static void displayTransactionHistory(Customer customer) throws IOException {
        System.out.println("Transaction History for " + customer.getUsername() + ":");
        if (customer.getTransactions().isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction transaction : customer.getTransactions()) {
                System.out.println("====================================");
                System.out.println("Transaction ID: " + transaction.getOrderID());
                System.out.println("Date: " + transaction.getCreatedAt());
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
                System.out.println("====================================");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Choose menu :");
        System.out.println("1. Rate");
        System.out.println("0. Back");

        System.out.println("Choose : ");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                rateFood(customer);
                break;
            case 0:
                Customer_menu.customer_menu(customer);
                break;
        }
    }

    public static void rateFood(Customer customer) throws IOException {
        System.out.println("Choose Item ID : ");
        int itemId = input.nextInt();
    
        System.out.println("Please enter your rating (1-5): ");
        int rating = input.nextInt();
        System.out.println("Please enter your comment: ");
        input.nextLine();
        String comment = input.nextLine();
    
        // Get all items from the customer's transactions
        List<Item> items = new ArrayList<>();
        for (Transaction transaction : customer.getTransactions()) {
            items.addAll(transaction.getCart().getItems().keySet());
        }
    
        // Find the item with the given ID
        Item itemToRate = Item.getItemById(items, itemId);
    
        if (itemToRate != null) {
            // Add the rating to the item
            itemToRate.getRating().addRate(rating);
            itemToRate.getRating().setPersonalRate(rating);
            itemToRate.getRating().setComment(comment);
            System.out.println("Thank you for your rating!");
        } else {
            System.out.println("Item not found. Please try again.");
        }

        displayTransactionHistory(customer);
    }
}
