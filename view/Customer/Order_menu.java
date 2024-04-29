package view.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Cart;
import model.Customer;
import model.Data_customer;
import model.Data_seller;
import model.Seller;
import model.Transaction;
import model.Item;

public class Order_menu {

    public static void order_menu(Customer cust) throws IOException {
        Data_seller dataSeller = new Data_seller();
        Scanner input = new Scanner(System.in);
        String continueOrdering, storeName = "";

        Cart[] carts = new Cart[4];
        carts[0] = new Cart();
        carts[0].addItem(Data_seller.getItemByID(1), 2);
        carts[0].addItem(Data_seller.getItemByID(2), 1);
        carts[0].addItem(Data_seller.getItemByID(3), 3);
        carts[0].addItem(Data_seller.getItemByID(4), 1);

        carts[1] = new Cart();
        carts[1].addItem(Data_seller.getItemByID(11), 2);
        carts[1].addItem(Data_seller.getItemByID(12), 1);
        carts[1].addItem(Data_seller.getItemByID(13), 3);
        carts[1].addItem(Data_seller.getItemByID(14), 1);

        carts[2] = new Cart();
        carts[2].addItem(Data_seller.getItemByID(21), 2);
        carts[2].addItem(Data_seller.getItemByID(22), 1);
        carts[2].addItem(Data_seller.getItemByID(23), 3);
        carts[2].addItem(Data_seller.getItemByID(24), 1);

        carts[3] = new Cart();
        carts[3].addItem(Data_seller.getItemByID(31), 2);
        carts[3].addItem(Data_seller.getItemByID(32), 1);
        carts[3].addItem(Data_seller.getItemByID(33), 3);
        carts[3].addItem(Data_seller.getItemByID(34), 1);

        Transaction[] dummy_transactions = {
                new Transaction(carts[0], "John Doe", "McDonald's", new Date(), "GoPay", (carts[0].getTotalPrice())),
                new Transaction(carts[1], "Jane", "Starbucks", new Date(), "GoPay", (carts[1].getTotalPrice())),
                new Transaction(carts[2], "Julia", "Subway", new Date(), "GoPay", (carts[2].getTotalPrice())),
                new Transaction(carts[3], "robertgmail", "KFC", new Date(), "GoPay", (carts[3].getTotalPrice()))
        };

        Transaction testT = new Transaction(carts[0], "john", "McDonald's", new Date(), "GoPay", (carts[0].getTotalPrice()));

        Customer dummy_cust1 = Data_customer.getCustomerbyEmail("johngmail");
        Customer dummy_cust2 = Data_customer.getCustomerbyEmail("janegmail");
        Customer dummy_cust3 = Data_customer.getCustomerbyEmail("juliagmail");
        Customer dummy_cust4 = Data_customer.getCustomerbyEmail("robertgmail");
        
        dummy_cust1.addTransaction(testT);
        dummy_cust1.addTransaction(dummy_transactions[0]);
        dummy_cust2.addTransaction(dummy_transactions[1]);
        dummy_cust3.addTransaction(dummy_transactions[2]);
        dummy_cust4.addTransaction(dummy_transactions[3]);
        
        Data_seller.sellers[0].addTransaction(dummy_transactions[0]);
        Data_seller.sellers[0].addIncome(dummy_transactions[0].getTotal());
        Data_seller.sellers[1].addTransaction(dummy_transactions[1]);
        Data_seller.sellers[1].addIncome(dummy_transactions[1].getTotal());
        Data_seller.sellers[2].addTransaction(dummy_transactions[2]);
        Data_seller.sellers[2].addIncome(dummy_transactions[2].getTotal());
        Data_seller.sellers[3].addTransaction(dummy_transactions[3]);
        Data_seller.sellers[3].addIncome(dummy_transactions[3].getTotal());

        
        // Data_customer.cust[0].addTransaction(dummy_transactions[0]);
        // Data_customer.cust[0].addTransaction(dummy_transactions[1]);
        // Data_customer.cust[0].addTransaction(dummy_transactions[2]);
        // Data_customer.cust[0].addTransaction(dummy_transactions[3]);

        System.out.println("=================");
        System.out.println("\tStore ");
        System.out.println("=================");
        System.out.println("1. McDonald's \n2. Starbucks \n3. Subway \n4. KFC");
        System.out.println("Choose : ");
        switch (input.nextInt()) {
            case 1:
                for (Item item : Data_seller.mcdonaldsMenu) {
                    System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: "
                            + item.getPrice() + "$ , Stock: " + item.getStock() + " , Discount: "
                            + item.getDiscountPercentage() + "%" + ", Rating: " + item.getRating().getAvg_rate());
                }
                storeName = "McDonald's";
                break;
            case 2:
                for (Item item : Data_seller.starbucksMenu) {
                    System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: "
                            + item.getPrice() + "$ , Stock: " + item.getStock() + " , Discount: "
                            + item.getDiscountPercentage() + "%" + ", Rating: " + item.getRating().getAvg_rate());
                }
                storeName = "Starbucks";
                break;
            case 3:
                for (Item item : Data_seller.subwayMenu) {
                    System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: "
                            + item.getPrice() + "$ , Stock: " + item.getStock() + " , Discount: "
                            + item.getDiscountPercentage() + "%" + ", Rating: " + item.getRating().getAvg_rate());
                }
                storeName = "Subway";
                break;
            case 4:
                for (Item item : Data_seller.kfcMenu) {
                    System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: "
                            + item.getPrice() + "$ , Stock: " + item.getStock() + " , Discount: "
                            + item.getDiscountPercentage() + "%" + ", Rating: " + item.getRating().getAvg_rate());
                }
                storeName = "KFC";
                break;
            default:
                System.out.println("Invalid input");
                Order_menu.order_menu(cust);
                break;
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

        Cart_view.cart_view(cust, storeName);
    }

    
}