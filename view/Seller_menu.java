package view;
import model.Seller;

import java.util.Scanner;

public class Seller_menu {
    public static Scanner input = new Scanner(System.in);

    public static void seller_menu(Seller cust){
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
                // View_profile();
                break;
            case 2:
                // View_order();
                break;
            case 3:
                // View_transaction();
                break;
            case 4:
                // seller_menu();
                break;
            case 5:
                // seller_menu();
                break;
            case 6:
                // seller_menu();
                break;
            case 0:
                // seller_menu();
                break;
            default:
                System.out.println("Invalid input");
                seller_menu(cust);
                break;
        }
    }
}
