package model;

public class Data_customer {

    public static Customer[] cust = {
        new Customer(1, "John Doe", "john", "password1", UserType.CUSTOMER, 1070, createDummyCart()),
        new Customer(2, "Jane Smith", "jane@example.com", "password2", UserType.CUSTOMER, 560, createDummyCart()),
        new Customer(3, "Robert Johnson", "robert@example.com", "password3", UserType.CUSTOMER, 210, createDummyCart()),
        new Customer(4, "Julia Davis", "julia@example.com", "password4", UserType.CUSTOMER, 230, createDummyCart()),
        new Customer(5, "admin", "admin123", "adminCust", UserType.CUSTOMER, 430, createDummyCart())
    };

    public static Cart createDummyCart() {
        Cart cart = new Cart();
        return cart;
    }
    public static Customer getCustomerbyEmail(String email) {
        for (Customer user : cust){
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}