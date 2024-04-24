package view.Customer;

import java.io.IOException;
import java.util.Scanner;

import controller.Notifications_controller;
import model.Customer;
import model.User;
import view.Main_menu;

public class Customer_menu {

    public static Scanner input = new Scanner(System.in);

    public static void customer_menu(Customer cust) throws IOException{
        System.out.println("========================");
        System.out.println("\tCustomer Menu");
        System.out.println("========================");
        System.out.println("1. View Profile");
        System.out.println("2. View Cart");
        System.out.println("3. View Transaction");
        System.out.println("4. Wallet");
        System.out.println("5. Order Food");
        System.out.println("0. Logout");

        System.out.println("Choose : ");
        switch (input.nextInt()) {
            case 1:
                Customer_profile.showProfile(cust);
                break;
            case 2:
                Cart_view.cart_view(cust);
                break;
            case 3:
                Customer_Transaction_view.displayTransactionHistory(cust);
                break;
            case 4:
                Wallet_menu.main_menu(cust);
                break;
            case 5:
                Order_menu.order_menu(cust);
                break;
            case 0:
                Main_menu.main_menu();
                break;
            default:
                System.out.println("Invalid input");
                customer_menu(cust);
                break;
        }
    }
    
}
