package controller;

import model.Data_customer;
import model.User;
import controller.*;
import model.UserType;
import view.*;

public class Login_controller {

    public static User user;

    public void login(String username, String password) {
        if (user.getUserType().equals(UserType.CUSTOMER)) {
            for (User user : Data_customer.users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    view.Customer_menu.customer_menu(user);
                }
            }
        }else{

        }
    }
}