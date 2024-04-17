package model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addItem(Item item, int quantity) {
        this.items.put(item, quantity);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void increaseQuantity(Item item, int quantity) {
        if (this.items.containsKey(item)) {
            this.items.put(item, this.items.get(item) + quantity);
        }
    }

    public void decreaseQuantity(Item item, int quantity) {
        if (this.items.containsKey(item)) {
            int currentQuantity = this.items.get(item);
            this.items.put(item, Math.max(currentQuantity - quantity, 0));
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Item, Integer> entry : this.items.entrySet()) {
            totalPrice += entry.getKey().getDiscountedPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }
}