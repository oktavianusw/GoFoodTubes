package view;

import java.util.List;

import model.Customer;
import model.Data_seller;
import model.Seller;
import model.Item;

public class Order_menu {

    public static void order_menu(Customer cust) {
        Data_seller seller = new Data_seller();

        seller.displayAllItemsForSellers();
    }
}
