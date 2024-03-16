package controller;

import model.Data_customer;
import model.User;
import controller.*;
import view.*;

public class Login_controller {
     
    public void login(String username, String password) {
        for (User user : Data_customer.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                view.Customer_menu.customer_menu(user);
            }
        }
    }
}