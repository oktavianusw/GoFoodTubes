package view;

import java.util.Map;

import model.Cart;
import model.Food;

public class Cart_view {

    public static void showCart(Cart cart) {
        System.out.println("========================");
        System.out.println("\tShopping Cart");
        System.out.println("========================");
        for (Map.Entry<Food, Integer> entry : cart.getFoods().entrySet()) {
            System.out.println("Food: " + entry.getKey().getName() + ", Quantity: " + entry.getValue());
        }
        System.out.println("Total Price: " + cart.getTotalPrice());
    }
}