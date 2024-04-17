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
            System.out.println("if");
            for (Customer cust : Data_customer.cust) {
                System.out.println(cust.getEmail() + cust.getPassword());
                if (cust.getEmail().equals(email) && cust.getPassword().equals(password)) {
                    Notifications_controller.send_message("Login successful!");
                    System.out.println();
                    System.out.println("Login successful. Welcome, " + cust.getUsername() + "!");
                    System.out.println();
                    view.Customer_menu.customer_menu(cust);
                    return true;
                }
            }
        } else {
            System.out.println("else");
            for (Seller seller : Data_seller.sellers) {
                System.out.println(seller.getEmail() + seller.getPassword());
                if (seller.getEmail().equals(email) && seller.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("Login successful. Welcome, " + seller.getUsername() + "!");
                    System.out.println();
                    view.Seller_menu.seller_menu(seller);
                    return true;
                }
            }
        }
        return false;
    }

}