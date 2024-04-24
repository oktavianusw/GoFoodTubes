package model;

import java.util.ArrayList;
import java.util.Random;

public class Gofood {
    private ArrayList<Voucher> voucher_gratis_ongkir;
    private ArrayList<Voucher> discount;
    
    public Gofood(ArrayList<Voucher> voucher_gratis_ongkir, ArrayList<Voucher> discount) {
        this.voucher_gratis_ongkir = generateDummyVouchers();
        this.discount = generateDummyVouchers();
    }
    public ArrayList<Voucher> getVoucher_gratis_ongkir() {
        return voucher_gratis_ongkir;
    }
    public void setVoucher_gratis_ongkir(ArrayList<Voucher> voucher_gratis_ongkir) {
        this.voucher_gratis_ongkir = voucher_gratis_ongkir;
    }
    public ArrayList<Voucher> getDiscount() {
        return discount;
    }
    public void setDiscount(ArrayList<Voucher> discount) {
        this.discount = discount;
    }

    public static ArrayList<Voucher> generateDummyVouchers() {
        ArrayList<Voucher> vouchers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double discountPercentage = random.nextInt(100) + 1;
            int quantity = random.nextInt(10) + 1;
            Voucher voucher = new Voucher(discountPercentage, quantity);
            vouchers.add(voucher);
        }
        return vouchers;
    }

}
