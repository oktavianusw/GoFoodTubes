package controller;

import java.io.IOException;

import model.Customer;
import model.Data_customer;
import model.Data_seller;
import model.Seller;
import model.UserType;

public class Login_controller {

    public boolean login(String email, String password, UserType userType) throws IOException {
        if (userType.equals(UserType.CUSTOMER)) {
            for (Customer cust : Data_customer.cust) {
                if (cust.getEmail().equals(email) && cust.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("Login successful. Welcome, " + cust.getUsername() + "!");
                    System.out.println();
                    view.Customer.Customer_menu.customer_menu(cust);
                    return true;
                }
            }
        } else if (userType.equals(UserType.SELLER)){
            for (Seller seller : Data_seller.sellers) {
                if (seller.getEmail().equals(email) && seller.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("Login successful. Welcome, " + seller.getUsername() + "!");
                    System.out.println();
                    view.Seller.Seller_menu.seller_menu(seller);
                    return true;
                }
            }
        } else{
            System.out.println("Invalid user type.");
            return false;
        }
        return false;
    }

}