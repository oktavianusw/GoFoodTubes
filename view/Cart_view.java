package view;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import model.Cart;
import model.Customer;
import model.Food;

public class Cart_view {

    public static Scanner input = new Scanner(System.in);

    public static void showCart(Customer cust) throws IOException {
        Cart cart = cust.getCart();
        System.out.println("========================");
        System.out.println("\tShopping Cart");
        System.out.println("========================");
        for (Map.Entry<Food, Integer> entry : cart.getFoods().entrySet()) {
            System.out.println("Food: " + entry.getKey().getName() + ", Quantity: " + entry.getValue());
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