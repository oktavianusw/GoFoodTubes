package view.Customer;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import model.Cart;
import model.Customer;
import model.Item;
import model.Transaction;
import view.Main_menu;

public class Checkout_view {

    public static void checkout(Customer cust) throws IOException {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int ongkir = rand.nextInt(10)+1;

        System.out.println("Payment Method : ");
        System.out.println("1. GoPay");
        System.out.println("2. COD (Cash On Delivery)");

        System.out.println("Choose your payment method : ");
        int pay = input.nextInt();
        String paymentMethod = "";

        switch (pay) {
            case 1:
                paymentMethod = "Gopay";
                if (cust.getBalance() >= cust.getCart().getTotalPrice()) {
                    paymentMethod = "Gopay";
                    cust.decreaseBalance(cust.getCart().getTotalPrice());
                } else {
                    System.out.println("Insufficient Gopay balance. Please choose another payment method or top up your Gopay.");
                    Checkout_view.checkout(cust);
                }
                break;
            case 2:
                paymentMethod = "COD";
                break;
            default:
                break;
        }

        System.out.println("Your order has been paid. Please wait for your order.");

        Transaction transaction = new Transaction(new Cart(), new Date(), paymentMethod, cust.getCart().getTotalPrice());
        transaction.getCart().fillWithOldCart(cust.getCart());

        System.out.println("Transaction Detail : ");
        System.out.println("Order ID: " + transaction.getOrder_ID());
        System.out.println("Date: " + transaction.getCreatedAt());
        System.out.println("Payment Method: " + transaction.getPaymentMethod());
        System.out.println("Items price: $" + transaction.getTotal());
        System.out.println("Ongkir : $"+ ongkir);
        System.out.println("Total price: $" + (transaction.getTotal() + ongkir));

        System.out.println("Items : ");
        for (Item item : transaction.getCart().getItems().keySet()) {
            System.out.println("Item ID : "+item.getItem_ID()+", Name: " + item.getItem_name() + ", Price: " + item.getPrice() + "$, Quantity: " + transaction.getCart().getItems().get(item));
        }

        cust.addTransaction(transaction); // add to transaction history
        
        cust.getCart().clear();
        System.out.println();
        System.out.println("Your order is being processed. Please wait for a moment. And go to the counter to get the food");
        System.out.println("Thank you for ordering! Please come again!");
        Customer_menu.customer_menu(cust);

    }
}