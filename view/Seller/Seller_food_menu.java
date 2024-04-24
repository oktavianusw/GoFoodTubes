package view.Seller;

import model.Item;
import model.Seller;

import java.util.Scanner;

public class Seller_food_menu {
    static int id_item = 9999;
    private static Scanner scanner = new Scanner(System.in);

    public static void seller_food_menu(Seller seller) {
        System.out.println("Seller: " + seller.getStoreName());
        if (seller.getItems() == null || seller.getItems().isEmpty()) {
            System.out.println("No items found for this seller.");
        } else {
            for (Item item : seller.getItems()) {
                if (item == null) {
                    System.out.println("Null item found.");
                } else {
                    System.out.println("Item ID: " + item.getItem_ID() + ", " + item.getItem_name() + ", Price: " + item.getPrice() + "$ , Stock: " + item.getStock()+" , Discount: "+item.getDiscountPercentage()+"%");
                }
            }
        }
        System.out.println("------------------------");
    
        System.out.println("1. Add item");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Back");
        System.out.println("Choose an option:");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                addItem(seller);
                break;
            case 2:
                editItem(seller);
                break;
            case 3:
                deleteItem(seller);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void addItem(Seller seller) {
        System.out.println("Enter the name of the item:");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the stock of the item:");
        int stock = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the discount of the item:");
        double discount = scanner.nextDouble();
        scanner.nextLine();
        Item item = new Item(id_item,name, price, stock, discount);
        seller.getItems().add(item);
        System.out.println("Item added successfully.");
        id_item++;
    }

    private static void editItem(Seller seller) {
        System.out.println("Enter the ID of the item you want to modifie:");
        int itemID = scanner.nextInt();
        for (Item item : seller.getItems()) {
            if (item.getItem_ID() == itemID) {
                System.out.println("Which attribute do you want to change?");
                System.out.println("1. Name");
                System.out.println("2. Price");
                System.out.println("3. Stock");
                System.out.println("4. Discount");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the new name for the item:");
                        String newName = scanner.nextLine();
                        item.setItem_name(newName);
                        break;
                    case 2:
                        System.out.println("Enter the new price for the item:");
                        double newPrice = scanner.nextDouble();
                        item.setPrice(newPrice);
                        scanner.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter the new stock for the item:");
                        int newStock = scanner.nextInt();
                        item.setStock(newStock);
                        scanner.nextLine();
                        break;
                    case 4:
                        System.out.println("Enter the new discount for the item:");
                        double newDiscount = scanner.nextDouble();
                        item.setDiscountPercentage(newDiscount);
                        scanner.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void deleteItem(Seller seller) {
        System.out.println("Enter the ID of the item you want to modifie:");
        int itemID = scanner.nextInt();
        for (Item item : seller.getItems()) {
            if (item.getItem_ID() == itemID) {
                seller.getItems().remove(item);
                System.out.println("Item deleted successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

}