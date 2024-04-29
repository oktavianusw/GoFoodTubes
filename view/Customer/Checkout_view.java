package view.Customer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import model.*;
import view.Main_menu;

public class Checkout_view {

    public static void checkout(Customer cust, String storeName) throws IOException {
        Seller seller = null;
        for (Seller sell : Data_seller.sellers){
            if (sell.getStoreName().equals(storeName)){
                seller = sell;
            }
        }
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
                    Checkout_view.checkout(cust, storeName);
                }
                break;
            case 2:
                paymentMethod = "COD";
                break;
            default:
                break;
        }

        System.out.println("Your order has been paid. Please wait for your order.");

        Transaction transaction = new Transaction(new Cart(), cust.getUsername(), storeName ,new Date(), paymentMethod, cust.getCart().getTotalPrice());
        transaction.getCart().fillWithOldCart(cust.getCart());

        System.out.println("Transaction Detail : ");
        System.out.println("Order ID: " + transaction.getOrder_ID());
        System.out.println("Date: " + transaction.getCreatedAt());
        System.out.println("Payment Method: " + transaction.getPaymentMethod());
        System.out.println("Items price: $" + transaction.getTotal());
        System.out.println("Ongkir : $"+ ongkir);
        System.out.println("Total price: $" + (transaction.getTotal() + ongkir));
        seller.addIncome(transaction.getTotal());

        applyVouchers(cust, transaction, ongkir);

        System.out.println("Items : ");
        for (Item item : transaction.getCart().getItems().keySet()) {
            System.out.println("Item ID : "+item.getItem_ID()+", Name: " + item.getItem_name() + ", Price: " + item.getPrice() + "$, Quantity: " + transaction.getCart().getItems().get(item));
        }

        cust.addTransaction(transaction); // add to transaction history
        seller.addTransaction(transaction); // add to transaction history

        
        cust.getCart().clear();
        System.out.println();
        System.out.println("Your order is being processed. Please wait for a driver.");
        System.out.println("Thank you for ordering! Leave us a 5 star rating!");
        Customer_menu.customer_menu(cust);

    }

    public static void applyVouchers(Customer cust, Transaction transaction, int ongkir) {
        // Get the user's vouchers
        ArrayList<Voucher> userVouchers = cust.getVouchers();

        Data_gofood gofood = new Data_gofood();
        ArrayList<Voucher> gofoodVouchers = gofood.getDiscount();
        ArrayList<Voucher> gofoodFreeShippingVouchers = gofood.getVoucher_gratis_ongkir();

        // Find the voucher with the highest percentage
        Voucher maxVoucher = null;
        for (Voucher voucher : userVouchers) {
            if (maxVoucher == null || voucher.getDiscountPercentage() > maxVoucher.getDiscountPercentage()) {
                maxVoucher = voucher;
            }
        }
        for (Voucher voucher : gofoodVouchers) {
            if (maxVoucher == null || voucher.getDiscountPercentage() > maxVoucher.getDiscountPercentage()) {
                maxVoucher = voucher;
            }
        }

        // Apply the voucher to the total price
        double total = transaction.getTotal();
        if (maxVoucher != null) {
            total -= total * maxVoucher.getDiscountPercentage() / 100;
            System.out.println("Applied voucher: " + maxVoucher.getName() + " - Discount: $" + total * maxVoucher.getDiscountPercentage() / 100);
        }

        if (!gofoodFreeShippingVouchers.isEmpty()) {
            Voucher freeShippingVoucher = gofoodFreeShippingVouchers.get(0);
            ongkir -= ongkir * freeShippingVoucher.getDiscountPercentage() / 100;
            System.out.println("Applied free shipping voucher: " + freeShippingVoucher.getName() + " - Discount: $" + ongkir * freeShippingVoucher.getDiscountPercentage() / 100);
        }

        // Print the transaction details
        System.out.println("Transaction Detail : ");
        System.out.println("Order ID: " + transaction.getOrder_ID());
        System.out.println("Date: " + transaction.getCreatedAt());
        System.out.println("Payment Method: " + transaction.getPaymentMethod());
        System.out.println("Items price: $" + transaction.getTotal());
        System.out.println("Ongkir : $"+ ongkir);
        System.out.println("Total price: $" + (total + ongkir));
    }
}