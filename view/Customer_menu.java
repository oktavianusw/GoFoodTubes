package view;

import java.util.Scanner;

import model.Customer;
import model.User;

public class Customer_menu {

    public static Scanner input = new Scanner(System.in);

    public static void customer_menu(Customer cust){
        System.out.println("========================");
        System.out.println("\tCustomer Menu");
        System.out.println("========================");
        System.out.println("1. View Profile");
        System.out.println("2. View Cart");
        System.out.println("3. View Transaction");
        System.out.println("4. Wallet");
        System.out.println("0. Logout");

        System.out.println("Choose : ");
        switch (input.nextInt()) {
            case 1:
                Customer_profile.showProfile(cust);
                break;
            case 2:
                Cart_view.showCart(cust.getCart());
                break;
            case 3:
                // View_transaction();
                break;
            case 4:
                // Wallet();
                break;
            case 0:
                // Logout();
                break;
            default:
                System.out.println("Invalid input");
                customer_menu(cust);
                break;
        }
    }
    
}
