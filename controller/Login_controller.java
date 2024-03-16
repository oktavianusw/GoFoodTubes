package controller;

import model.Customer;
import model.Data_customer;
import model.Data_seller;
import model.Seller;
import model.UserType;

public class Login_controller {

    public UserType login(String username, String password, UserType userType) {
        if (userType.equals(UserType.CUSTOMER)) {
            for (Customer cust : Data_customer.cust) {
                if (cust.getUsername().equals(username) && cust.getPassword().equals(password)) {
                    // view.Customer_menu.customer_menu(cust);
                    return UserType.CUSTOMER;
                } else {
                    return null;
                }
            }
        } else {
            for (Seller seller : Data_seller.sellers) {
                if (seller.getUsername().equals(username) && seller.getPassword().equals(password)) {
                    // view.Seller_menu.seller_menu(seller);
                    return UserType.SELLER;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
}