package view;
import java.util.Date;
import java.util.Scanner;

import model.Customer;
import model.Transaction;

public class Checkout_view {

    public static void checkout(Customer cust) {
        Scanner input = new Scanner(System.in);

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

        Transaction transaction = new Transaction(cust, new Date(), paymentMethod, cust.getCart().getTotalPrice());

        System.out.println("Transaction Detail : ");
        System.out.println("Order ID: " + transaction.getOrder_ID());
        System.out.println("Date: " + transaction.getCreatedAt());
        System.out.println("Payment Method: " + transaction.getPaymentMethod());
        System.out.println("Total: $" + transaction.getTotal());

        System.out.println();
        System.out.println("Your order is being processed. Please wait for a moment. And go to the counter to get the food");
        System.out.println("Thank you for ordering! Please come again!");
    }
}