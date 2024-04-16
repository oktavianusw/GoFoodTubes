package view;

import java.io.IOException;
import java.util.Scanner;

import javax.management.Notification;

import controller.Login_controller;
import controller.Notifications_controller;
import model.UserType;

public class Login_menu {
    public static Scanner input = new Scanner(System.in);
    public static Login_controller login_controller = new Login_controller();
    
    public static void login(UserType userType) throws IOException{
        int attempts = 0;
        while (attempts < 3 ) {
            System.out.println();
            System.out.println("=====================");
            System.out.println("\tLogin");
            System.out.println("=====================");
            System.out.println("Email : ");
            String email = input.nextLine();
            System.out.println("Password : ");
            String password = input.nextLine();

            if (login_controller.login(email, password, userType)) {
                return;
            } else {
                System.out.println("Login failed. Incorrect username or password. Please try again.");
                attempts++;
            }
        }
        if (attempts >= 3) {
            System.out.println("You have exceeded the maximum number of login attempts.");
        }    }
}
