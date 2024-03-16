package model;

public class Data_customer {
    public static User[] users = {
        new User(1, "John Doe", "john@example.com", "password1", UserType.CUSTOMER),
        new User(2, "Jane Smith", "jane@example.com", "password2", UserType.CUSTOMER),
        new User(3, "Robert Johnson", "robert@example.com", "password3", UserType.CUSTOMER),
        new User(4, "Julia Davis", "julia@example.com", "password4", UserType.CUSTOMER),
        new User(5, "adminCust", "adminCust", "adminCust", UserType.CUSTOMER)
    };
}