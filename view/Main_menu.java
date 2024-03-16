package view;

import java.util.Scanner;
import view.Login;

public class Main_menu {

    public static Scanner input = new Scanner(System.in);

    public static void main_menu(){
        System.out.println("GoFood as : ");
        System.out.println("1. GoSeller");
        System.out.println("2. GOCustomer");
        System.out.println("3. Exit");

        System.out.print("Choose : ");

        switch (input.nextInt()) {
             case 1:
                 Seller_menu();
                 break;
            case 2:
                Login.login();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                main_menu();
                break;
        }
    }
}
