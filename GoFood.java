import java.io.IOException;
import java.util.Scanner;

import model.Data_seller;
import model.Data_transaction;
import view.Main_menu;
import view.Customer.Order_menu;
public class GoFood {

    public Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        // Init Data Seller
        Data_seller data = new Data_seller();
        // Order_menu.initTransactionData();
        Main_menu.main_menu();
    }
}
