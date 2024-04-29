package model;

import java.util.ArrayList;

public class Data_seller {
    public static ArrayList<Item> mcdonaldsMenu = new ArrayList<>();
    public static ArrayList<Item> starbucksMenu = new ArrayList<>();
    public static ArrayList<Item> subwayMenu = new ArrayList<>();
    public static ArrayList<Item> kfcMenu = new ArrayList<>();
    


    

    public static Seller[] sellers = {
        new Seller(201, "McDonald's", "mcdonalds@email.com", "password2", UserType.SELLER, "McDonald's", mcdonaldsMenu),
        new Seller(202, "Starbucks", "starbucks@email.com", "password1", UserType.SELLER, "Starbucks", starbucksMenu),
        new Seller(203, "Subway", "subway@email.com", "password3", UserType.SELLER, "Subway", subwayMenu),
        new Seller(204, "KFC", "seller", "sellerpass", UserType.SELLER, "KFC", kfcMenu)
    };

    public static Seller getSellerbyEmail(String email) {
        for (Seller seller : sellers) {
            if (seller.getEmail().equals(email)) {
                return seller;
            }
        }
        return null;
    }

    public static void initData() {
        // McDonald's
        mcdonaldsMenu.add(new Item(1, "Big Mac", 10.0, 20, 0.1));
        mcdonaldsMenu.add(new Item(2, "Cheeseburger", 5.0, 15, 0.0));
        mcdonaldsMenu.add(new Item(3, "Chicken McNuggets", 8.0, 30, 0.15));
        mcdonaldsMenu.add(new Item(4, "French Fries", 3.0, 50, 0.0));
        mcdonaldsMenu.add(new Item(5, "Filet-O-Fish", 7.0, 10, 0.05));
        mcdonaldsMenu.add(new Item(6, "McChicken", 6.0, 25, 0.0));
        mcdonaldsMenu.add(new Item(7, "Quarter Pounder with Cheese", 8.0, 20, 0.0));
        mcdonaldsMenu.add(new Item(8, "Egg McMuffin", 4.0, 30, 0.1));
        mcdonaldsMenu.add(new Item(9, "McFlurry", 3.5, 15, 0.0));
        mcdonaldsMenu.add(new Item(10, "Apple Pie", 2.0, 40, 0.0));

        // Starbucks
        starbucksMenu.add(new Item(11, "Caramel Macchiato", 4.5, 20, 0.0));
        starbucksMenu.add(new Item(12, "Pumpkin Spice Latte", 5.0, 25, 0.0));
        starbucksMenu.add(new Item(13, "Java Chip Frappuccino", 6.0, 15, 0.1));
        starbucksMenu.add(new Item(14, "Bacon & Gouda Breakfast Sandwich", 4.0, 20, 0.0));
        starbucksMenu.add(new Item(15, "Classic Whole Grain Oatmeal", 3.5, 10, 0.0));
        starbucksMenu.add(new Item(16, "Turkey & Havarti Sandwich", 5.5, 15, 0.05));
        starbucksMenu.add(new Item(17, "Chocolate Chunk Cookie", 2.0, 30, 0.0));
        starbucksMenu.add(new Item(18, "Iced White Chocolate Mocha", 5.5, 20, 0.0));
        starbucksMenu.add(new Item(19, "Spinach & Feta Wrap", 4.0, 25, 0.0));
        starbucksMenu.add(new Item(20, "Double Chocolate Brownie", 3.0, 10, 0.0));

        // Subway
        subwayMenu.add(new Item(21, "Italian B.M.T. Sandwich", 6.0, 20, 0.0));
        subwayMenu.add(new Item(22, "Oven Roasted Chicken Sub", 7.0, 25, 0.0));
        subwayMenu.add(new Item(23, "Spicy Italian Sub", 5.5, 15, 0.0));
        subwayMenu.add(new Item(24, "Tuna Sub", 6.5, 20, 0.0));
        subwayMenu.add(new Item(25, "Veggie Delite Sub", 5.0, 30, 0.0));
        subwayMenu.add(new Item(26, "Meatball Marinara Sub", 6.0, 15, 0.0));
        subwayMenu.add(new Item(27, "Turkey Breast Sub", 6.5, 25, 0.05));
        subwayMenu.add(new Item(28, "Subway Club Sub", 6.5, 20, 0.0));
        subwayMenu.add(new Item(29, "Black Forest Ham Sub", 6.0, 20, 0.0));
        subwayMenu.add(new Item(30, "Steak & Cheese Sub", 7.5, 15, 0.0));

        // KFC
        kfcMenu.add(new Item(31, "Original Recipe Chicken", 5.0, 20, 0.0));
        kfcMenu.add(new Item(32, "Crispy Colonel Sandwich", 4.5, 15, 0.0));
        kfcMenu.add(new Item(33, "Popcorn Chicken", 3.5, 25, 0.0));
        kfcMenu.add(new Item(34, "Chicken Tenders", 6.0, 20, 0.0));
        kfcMenu.add(new Item(35, "Extra Crispy Chicken", 5.5, 10, 0.0));
        kfcMenu.add(new Item(36, "Famous Bowl", 4.0, 30, 0.0));
        kfcMenu.add(new Item(37, "Chicken Pot Pie", 5.0, 15, 0.0));
        kfcMenu.add(new Item(38, "Chicken & Biscuit Bowl", 6.5, 20, 0.0));
        kfcMenu.add(new Item(39, "KFC Snacker", 3.0, 25, 0.0));
        kfcMenu.add(new Item(40, "Twister Wrap", 4.5, 15, 0.0));
    }

//    public void displayAllItemsForSellers() {
//        for (Seller seller : sellers) {
//            System.out.println("Seller: " + seller.getStoreName());
//            System.out.println("Items:");
//            for (Item item : seller.getItems()) {
//                System.out.println("Item ID : " + item.getItem_ID() + "  Item: " + item.getItem_name() + ", Price: " + item.getPrice() + ", Stock: " + item.getStock() + " , Discount: " + item.getDiscountPercentage());
//            }
//            System.out.println("------------------------");
//        }
//    }

    public static Item getItemByID(int id) {
        for (Seller seller : sellers) {
            for (Item item : seller.getItems()) {
                if (item.getItem_ID() == id) {
                    return item;
                }
            }
        }
        return null;
    }
}
