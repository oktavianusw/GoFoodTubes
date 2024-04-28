package view.Customer;
import java.io.IOException;
import java.util.Scanner;

import model.Customer;
import model.Data_seller;
import model.Item;

public class Cart_view {

    public static void cart_view(Customer cust, String storeName) throws IOException {
        Scanner input = new Scanner(System.in);
        String continueOrdering;

        do {
            System.out.println("Your cart:");
            for (Item item : cust.getCart().getItems().keySet()) {
                System.out.println("Item ID : "+item.getItem_ID()+", Name: " + item.getItem_name() + ", Price: " + item.getPrice() + "$, Quantity: " + cust.getCart().getItems().get(item));
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
                Checkout_view.checkout(cust, storeName);
                break;
        
            default:
                Customer_menu.customer_menu(cust);
                break;
        }
    }
}