package model;

public class Data_customer {

    public static Customer[] cust = {
        new Customer(1, "John Doe", "johngmail", "password1", UserType.CUSTOMER, 1070, createDummyCart()),
        new Customer(2, "Jane Smith", "janegmail", "password2", UserType.CUSTOMER, 560, createDummyCart()),
        new Customer(3, "Robert Johnson", "robertgmail", "password3", UserType.CUSTOMER, 210, createDummyCart()),
        new Customer(4, "Julia Davis", "juliagmail", "password4", UserType.CUSTOMER, 230, createDummyCart()),
        new Customer(5, "admin", "customer", "customerpass", UserType.CUSTOMER, 43, createDummyCart())
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