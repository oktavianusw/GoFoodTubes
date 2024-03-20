package controller;

import model.User;
import model.Customer;
import model.Data_customer;
import model.Data_seller;
import model.Seller;
import model.UserType;

public class Login_controller {

    public static User user;
    public User login(String username, String password, UserType userType) {
        if (userType.equals(UserType.CUSTOMER)) {
            for (Customer cust : Data_customer.cust) {
                if (cust.getUsername().equals(username) == cust.getPassword().equals(password)) {
                    // view.Customer_menu.customer_menu(cust);
                    return user;
                } else {
                    return user;
                }
            }
        } else {
            for (Seller seller : Data_seller.sellers) {
                if (seller.getUsername().equals(username) == seller.getPassword().equals(password)) {
                    // view.Seller_menu.seller_menu(seller);
                    return user;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
}