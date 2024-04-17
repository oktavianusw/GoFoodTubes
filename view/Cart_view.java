package view;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import model.Cart;
import model.Customer;
import model.Item;

public class Cart_view {

    public static Scanner input = new Scanner(System.in);

    public static void showCart(Customer cust) throws IOException {
        Cart cart = cust.getCart();
        System.out.println("========================");
        System.out.println("\tShopping Cart");
        System.out.println("========================");
        for (Map.Entry<Item, Integer> entry : cart.getItems().entrySet()) {
            System.out.println("Item: " + entry.getKey().getItem_name() + ", Quantity: " + entry.getValue());
        }
        System.out.println("Total Price: " + cart.getTotalPrice());
    
        System.out.println("0. Back");
        switch (input.nextInt()) {
            case 0:
                Customer_menu.customer_menu(cust);
                break;
        
            default:
                System.out.println("Invalid input");
                showCart(cust);
                break;
        }
    }
}