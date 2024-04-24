package controller;

import java.io.IOException;

import model.Seller;
import view.Seller.Seller_food_menu;
import view.Seller.Seller_profile;

public class Seller_controller {
    public static void View_profile(Seller sell) throws IOException{
        Seller_profile.showProfile(sell);
    }

    public static void View_order(Seller sell){

    }

    public static void View_transaction(Seller sell){
        

    }

    public static void Food_menu(Seller sell){
        Seller_food_menu.seller_food_menu(sell);
    }

    public static void Income(Seller sell){

    }

    public static void Set_voucher(Seller sell){

    }

}
