package controller;

import model.User;
import model.Customer;
import model.Data_customer;
import model.Data_seller;
import model.Seller;
import model.UserType;

public class Login_controller {

<<<<<<< HEAD
    public boolean login(String email, String password, UserType userType) {
        if (userType.equals(UserType.CUSTOMER)) {
            for (Customer cust : Data_customer.cust) {
                if (cust.getEmail().equals(email) && cust.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("Login successful. Welcome, " + cust.getUsername() + "!");
                    System.out.println();
                    view.Customer_menu.customer_menu(cust);
                    return true;
                } else {
                    return false;
=======
    public static User user;
    public User login(String username, String password, UserType userType) {
        if (userType.equals(UserType.CUSTOMER)) {
            for (Customer cust : Data_customer.cust) {
                if (cust.getUsername().equals(username) == cust.getPassword().equals(password)) {
                    // view.Customer_menu.customer_menu(cust);
                    return user;
                } else {
                    return user;
>>>>>>> 19401fb97722fe652a8ede639fe509ed69084c7e
                }
            }
        } else {
            for (Seller seller : Data_seller.sellers) {
<<<<<<< HEAD
                if (seller.getEmail().equals(email) && seller.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("Login successful. Welcome, " + seller.getUsername() + "!");
                    System.out.println();
                    view.Seller_menu.seller_menu(seller);
                    return true;
=======
                if (seller.getUsername().equals(username) == seller.getPassword().equals(password)) {
                    // view.Seller_menu.seller_menu(seller);
                    return user;
>>>>>>> 19401fb97722fe652a8ede639fe509ed69084c7e
                } else {
                    return false;
                }
            }
        };
        return false;
    }
}