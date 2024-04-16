package view;
import model.Seller;
import controller.Seller_controller;

import java.util.Scanner;

public class Seller_menu {
    public static Scanner input = new Scanner(System.in);

    public static void seller_menu(Seller sell){
        System.out.println("========================");
        System.out.println("\tSeller Menu");
        System.out.println("========================");
        System.out.println("1. View Profile");
        System.out.println("2. View Order");
        System.out.println("3. View Transaction");
        System.out.println("4. Food Menu");
        System.out.println("5. Income");
        System.out.println("6. Set Voucher");
        System.out.println("0. Logout");

        System.out.println("Choose : ");
        switch (input.nextInt()) {
            case 1:
                 Seller_controller.View_profile(sell);
                break;
            case 2:
                Seller_controller.View_order(sell);
                break;
            case 3:
                Seller_controller.View_transaction(sell);
                break;
            case 4:
                Seller_controller.Food_menu(sell);
                break;
            case 5:
                Seller_controller.Income(sell);
                break;
            case 6:
                Seller_controller.Set_voucher(sell);
                break;
            case 0:
                // seller_menu();
                break;
            default:
                System.out.println("Invalid input");
                seller_menu(sell);
                break;
        }
    }
}
