package view.Customer;

import java.util.Date;
import java.util.Scanner;

import model.Customer;
import model.Data_seller;
import model.Seller;
import model.Transaction;
import model.Item;

public class Order_menu {

    // public static void displayItems() {

    //     Data_seller dataSeller = new Data_seller();
    //     for (Seller seller : Data_seller.sellers) {
    //         System.out.println("Seller: " + seller.getStoreName());
    //         for (Item item : seller.getItems()) {
    //             System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: " + item.getPrice() + "$ , Stock: " + item.getStock()+" , Discount: "+item.getDiscountPercentage()+"%");
    //         }
    //         System.out.println("------------------------");
    //     }
    // }

    public static void order_menu(Customer cust) {
        Data_seller dataSeller = new Data_seller();
        Scanner input = new Scanner(System.in);
        String continueOrdering;

        for (Seller seller : Data_seller.sellers) {
            System.out.println("Seller: " + seller.getStoreName());
            for (Item item : seller.getItems()) {
                System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: " + item.getPrice() + "$ , Stock: " + item.getStock()+" , Discount: "+item.getDiscountPercentage()+"%");
            }
            System.out.println("------------------------");
        }

        do {
            System.out.println("Choose item to order by ID: ");
            int item_id = input.nextInt();

            System.out.println("Enter quantity: ");
            int quantity = input.nextInt();

            Item item = Data_seller.getItemByID(item_id);
            if (item != null) {
                cust.getCart().addItem(item, quantity);
                System.out.println("Item added to cart.");
            } else {
                System.out.println("Item not found.");
            }

            System.out.println("Do you want to order another item? (y/n)");
            continueOrdering = input.next();
        } while (continueOrdering.equalsIgnoreCase("y"));

        Cart_view.cart_view(cust);

    }
}