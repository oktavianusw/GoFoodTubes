package model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Food, Integer> foods;

    public Cart() {
        this.foods = new HashMap<>();
    }

    public void addFood(Food food, int quantity) {
        this.foods.put(food, quantity);
    }

    public void removeFood(Food food) {
        this.foods.remove(food);
    }

    public void increaseQuantity(Food food, int quantity) {
        if (this.foods.containsKey(food)) {
            this.foods.put(food, this.foods.get(food) + quantity);
        }
    }

    public void decreaseQuantity(Food food, int quantity) {
        if (this.foods.containsKey(food)) {
            int currentQuantity = this.foods.get(food);
            this.foods.put(food, Math.max(currentQuantity - quantity, 0));
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Food, Integer> entry : this.foods.entrySet()) {
            totalPrice += entry.getKey().getDiscountedPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public Map<Food, Integer> getFoods() {
        return foods;
    }
}