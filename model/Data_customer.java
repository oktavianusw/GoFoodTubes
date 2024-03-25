package model;

public class Data_customer {

    public static Customer[] cust = {
        new Customer(1, "John Doe", "john@example.com", "password1", UserType.CUSTOMER, createDummyCart()),
        new Customer(2, "Jane Smith", "jane@example.com", "password2", UserType.CUSTOMER, createDummyCart()),
        new Customer(3, "Robert Johnson", "robert@example.com", "password3", UserType.CUSTOMER, createDummyCart()),
        new Customer(4, "Julia Davis", "julia@example.com", "password4", UserType.CUSTOMER, createDummyCart()),
        new Customer(5, "adminCust", "adminCust", "adminCust", UserType.CUSTOMER, createDummyCart())
    };

    public static Cart createDummyCart() {
        Cart cart = new Cart();
        cart.addFood(Data_food.foods[0], 2);
        cart.addFood(Data_food.foods[1], 1);
        return cart;
    }
}