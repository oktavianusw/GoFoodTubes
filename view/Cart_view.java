package view;
import java.util.Scanner;

import model.Customer;
import model.Data_seller;
import model.Item;

public class Cart_view {

    public static void cart_view(Customer cust) {
        Scanner input = new Scanner(System.in);
        String continueOrdering;

        do {
            System.out.println("Your cart:");
            for (Item item : cust.getCart().getItems().keySet()) {
                System.out.println("Item: " + item.getItem_name() + ", Price: " + item.getPrice() + "$, Quantity: " + cust.getCart().getItems().get(item));
            }

            System.out.println("Do you want to modify your cart? (y/n)");
            continueOrdering = input.next();

            if (continueOrdering.equalsIgnoreCase("y")) {
                System.out.println("Enter the ID of the item you want to modify:");
                int item_id = input.nextInt();

                Item item = Data_seller.getItemByID(item_id);
                if (item != null) {
                    System.out.println("Enter the new quantity:");
                    int quantity = input.nextInt();

                    if (quantity > 0) {
                        cust.getCart().getItems().put(item, quantity);
                        System.out.println("Item quantity updated.");
                    } else {
                        cust.getCart().getItems().remove(item);
                        System.out.println("Item removed from cart.");
                    }
                } else {
                    System.out.println("Item not found.");
                }
            }
        } while (continueOrdering.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("Choose menu :");
        System.out.println("1. Check Out");
        System.out.println("0. Back");

        System.out.println("Choose : ");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                Checkout_view.checkout(cust);
                break;
        
            default:
                Order_menu.order_menu(cust);
                break;
        }
    }
}