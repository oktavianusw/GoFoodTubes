package model;

import java.util.ArrayList;

public class Data_item {
    
    public ArrayList<Item> items = new ArrayList<>();

    public Data_item() {
        items.add(new Item(1, "Pizza", 10.0, 20, 0.1));
        items.add(new Item(2, "Burger", 8.0, 15, 0.15));
        items.add(new Item(3, "Pasta", 12.0, 10, 0.2));
        items.add(new Item(4, "Salad", 7.0, 25, 0.05));
    }
    
}
