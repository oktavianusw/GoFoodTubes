package view.Seller;
import model.Seller;
import view.Main_menu;
import controller.Seller_controller;

import java.io.IOException;
import java.util.Scanner;

public class Seller_menu {
    public static Scanner input = new Scanner(System.in);

    public static void seller_menu(Seller seller) throws IOException{
        System.out.println("========================");
        System.out.println("\tSeller Menu");
        System.out.println("========================");
        System.out.println("1. View Profile");
        System.out.println("2. View Transaction");
        System.out.println("3. Food Menu");
        System.out.println("4. Income");
        System.out.println("5. Set Voucher");
        System.out.println("0. Logout");

        System.out.println("Choose : ");
        switch (input.nextInt()) {
            case 1:
                 Seller_controller.View_profile(seller);
                break;
            case 2:
                Seller_controller.View_order(seller);
                break;
            case 3:
                Seller_controller.Food_menu(seller);
                break;
            case 4:
                Seller_controller.Food_menu(seller);
                break;
            case 5:
                Seller_controller.Income(seller);
                break;
            case 6:
                Seller_controller.Set_voucher(seller);
                break;
            case 0:
                Main_menu.main_menu();
                break;
            default:
                System.out.println("Invalid input");
                seller_menu(seller);
                break;
        }
    }
}
