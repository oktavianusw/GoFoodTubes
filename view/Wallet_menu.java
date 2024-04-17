package view;

import controller.Wallet_controller;
import model.Customer;

import java.io.IOException;
import java.util.Scanner;
public class Wallet_menu {
    public static Scanner input = new Scanner(System.in);

    public static void main_menu(Customer cust) throws IOException{
        System.out.println("===============");
        System.out.println("Wallet Menu");
        System.out.println("===============");
        System.out.println("1. View Balance");
        System.out.println("2. Top Up");
        System.out.println("3. Transfer");
        System.out.println("0. Back");

        System.out.print("Choose : ");

        switch (input.nextInt()) {
            case 1:
                Wallet_controller.view_balance(cust);
                main_menu(cust);
                break;
            case 2:
                System.out.println("Masukan Nominal: ");
                int topUp = input.nextInt();
                Wallet_controller.top_up(cust, topUp);
                main_menu(cust);
                break;
            case 3:
                input.nextLine();
                System.out.println("Masukan Email tujuan: ");
                String email = input.nextLine();
                System.out.println("Masukan Nominal: ");
                int transfer = input.nextInt();
                Wallet_controller.transfer(cust, email, transfer);
                main_menu(cust);
                break;
            case 0:
                Main_menu.main_menu();
            default:
                System.out.println("Invalid Input");
                main_menu(cust);
                break;
        }
    }

}
