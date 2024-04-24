package view;

import java.io.IOException;
import java.util.Scanner;

import model.Data_seller;
import model.UserType;
import view.Login_menu;

public class Main_menu {

    public static Scanner input = new Scanner(System.in);

    public static void main_menu() throws IOException{
        Data_seller.initData();
        System.out.println("========================");
        System.out.println("GoFood as : ");
        System.out.println("1. GoSeller");
        System.out.println("2. GoCustomer");
        System.out.println("0. Exit");
        System.out.println("========================");
        

        System.out.print("Choose : ");

        switch (input.nextInt()) {
             case 1:
                Login_menu.login(UserType.SELLER);
                break;
            case 2:
                Login_menu.login(UserType.CUSTOMER);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                main_menu();
                break;
        }
    }
}
