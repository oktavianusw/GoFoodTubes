package view;

import java.util.Scanner;

import controller.Login_controller;

public class Login {

    public static Scanner input = new Scanner(System.in);
    public static Login_controller login_controller = new Login_controller();
    
    public static void login(){
        System.out.println("===============");
        System.out.println("\tLogin");
        System.out.println("===============");
        System.out.println("Email : ");
        String email = input.nextLine();
        System.out.println("Password : ");
        String password = input.nextLine();

        
        


    }
}
