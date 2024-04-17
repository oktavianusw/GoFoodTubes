package view;

import model.Seller;

import java.util.Scanner;

public class Seller_profile {

    public static Scanner input = new Scanner(System.in);
    public static void showProfile(Seller sell) {
        System.out.println("=============================");
        System.out.println("\tSeller Profile");
        System.out.println("=============================");
        System.out.println("Username: " + sell.getUsername());
        System.out.println("Email: " + sell.getEmail());
        // System.out.println("Wallet: " + sell.getBalance());

        System.out.println("1. Edit Profile");
        System.out.println("0. Back");

        System.out.println("Choose : ");

        switch (input.nextInt()) {
            case 1:
                editProfile(sell);
                break;
            case 0:
                Seller_menu.seller_menu(sell);
                break;
            default:
                System.out.println("Invalid input");
                showProfile(sell);
                break;
        }
    }

    public static void editProfile(Seller sell) {
        System.out.println("=============================");
        System.out.println("\tEdit Profile");
        System.out.println("=============================");
        System.out.println("Username: " + sell.getUsername());
        System.out.println("Email: " + sell.getEmail());
        // System.out.println("Wallet: " + sell.getBalance());

        System.out.println("1. Change Username");
        System.out.println("2. Change Password");
        System.out.println("0. Back");

        System.out.println("Choose : ");

        switch (input.nextInt()) {
            case 0:
                showProfile(sell);
                break;
            case 1:
                System.out.println("Enter new username: ");
                input.nextLine();
                sell.setUsername(input.nextLine());
                System.out.println("Username changed successfully.");
                showProfile(sell);
                break;
            case 2:
                changePassword(sell);
                break;
            default:
                System.out.println("Invalid input");
                editProfile(sell);
                break;
        }
    }

    public static void changePassword (Seller sell){
        System.out.println("Enter new password: ");
        String newPassword = input.nextLine();
        System.out.println("Re-enter new password: ");
        String retypePassword = input.nextLine();
        if (newPassword.equals(retypePassword)) {
            System.out.println("Enter old password to confirm:");
            if (input.nextLine().equals(sell.getPassword())) {
                sell.setPassword(newPassword);
                System.out.println("Password changed successfully.");
            }
        } else {
            System.out.println("Password does not match. Please try again.");
            changePassword(sell);
        }
    }
}
