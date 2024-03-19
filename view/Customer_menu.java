package view;

import model.Customer;
import model.User;
import java.util.Scanner;

public class Customer_menu {

    public static Scanner input = new Scanner(System.in);
    public static void customer_menu(Customer cust){
        System.out.println("===============");
        System.out.println("\tCustomer Menu");
        System.out.println("===============");
        System.out.println("1. View Profile");
        System.out.println("2. View Cart");
        System.out.println("3. View Transaction");
        System.out.println("4. Wallet");
        System.out.println("0. Logout");
        switch(input.nextInt()){
            case 1:
                Wallet_menu.main_menu(cust);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:

                break;
            case 0:
                Main_menu.main_menu();
                break;
        }
    }
    
}
