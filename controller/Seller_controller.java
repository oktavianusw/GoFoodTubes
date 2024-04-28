package controller;

import java.io.IOException;

import model.Seller;

import view.Seller.Seller_food_menu;
import view.Seller.Seller_menu;
import view.Seller.Seller_profile;

public class Seller_controller {
    public static void View_profile(Seller sell) throws IOException{
        Seller_profile.showProfile(sell);
        Seller_menu.seller_menu(sell);
    }

    public static void Food_menu(Seller sell) throws IOException {
        Seller_food_menu.seller_food_menu(sell);
        Seller_menu.seller_menu(sell);
    }

    public static void Income(Seller sell) throws IOException {
        System.out.println("Income: " + sell.getIncome());
        Seller_menu.seller_menu(sell);
    }
}
