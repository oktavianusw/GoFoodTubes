package view;

import java.util.Scanner;

import model.Customer;

public class Customer_profile {

    public static Scanner input = new Scanner(System.in);

    public static void showProfile(Customer cust) {
        System.out.println("=============================");
        System.out.println("\tCustomer Profile");
        System.out.println("=============================");
        System.out.println("Username: " + cust.getUsername());
        System.out.println("Email: " + cust.getEmail());
        System.out.println("Wallet: " + cust.getWallet());

        System.out.println("1. Edit Profile");
        System.out.println("0. Back");

        System.out.println("Choose : ");

        switch (input.nextInt()) {
            case 1:
                editProfile(cust);
                break;
            case 0:
                Customer_menu.customer_menu(cust);
                break;
            default:
                System.out.println("Invalid input");
                showProfile(cust);
                break;
        }
    }

    public static void editProfile(Customer cust) {
        System.out.println("=============================");
        System.out.println("\tEdit Profile");
        System.out.println("=============================");
        System.out.println("Username: " + cust.getUsername());
        System.out.println("Email: " + cust.getEmail());
        System.out.println("Wallet: " + cust.getWallet());

        System.out.println("1. Change Username");
        System.out.println("2. Change Password");
        System.out.println("0. Back");

        System.out.println("Choose : ");

        switch (input.nextInt()) { 
            case 0:
                showProfile(cust);
                break;
            case 1:
                System.out.println("Enter new username: ");
                input.nextLine();
                cust.setUsername(input.nextLine());
                System.out.println("Username changed successfully.");
                showProfile(cust);
                break;
            case 2:
                changePassword(cust);
                break;
            default:
                System.out.println("Invalid input");
                editProfile(cust);
                break;
        }
    }

    public static void changePassword (Customer cust){
        System.out.println("Enter new password: ");
        String newPassword = input.nextLine();
        System.out.println("Re-enter new password: ");
        String retypePassword = input.nextLine();
        if (newPassword.equals(retypePassword)) {
            System.out.println("Enter old password to confirm:");
            if (input.nextLine().equals(cust.getPassword())) {
                cust.setPassword(newPassword);
                System.out.println("Password changed successfully.");
            }
        } else {
            System.out.println("Password does not match. Please try again.");
            changePassword(cust);
        }
    }

}