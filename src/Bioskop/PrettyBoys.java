/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bioskop;

/**
 *
 * @author ASUS
 */
public class PrettyBoys extends Bioskop {
    
    public PrettyBoys(String genre, double rating, int harga, String noKursi, int jumlah, int bayar) {
        super(genre, rating, harga, noKursi, jumlah, bayar);
    }
    
    @Override // menunjukkan method overriding
    public void Display() {
        System.out.println("Genre Film      : " + genre);
        System.out.println("Rating Film     : " + rating);
        System.out.println("Harga Tiket     : Rp" + harga);
    }

    @Override // menunjukkan method overriding
    public void total() {
        int total = jumlah * harga;
        System.out.println("Maka Total yang Harus Dibayarkan");
        System.out.println("Total           : Rp" + total);
    }

    @Override //menunjukkan method overriding
      public void pembayaran() {
        int pembayaran;
        pembayaran = bayar - (jumlah * harga);
            System.out.println("Kembalian       : Rp" + pembayaran);
    }
    
    //merupakan method overloading
    public void favorit(){
        if(rating >= 80){
            System.out.println("Merupakan Film Box Office");
        } else {
            System.out.println("Bukan Film Box Office");
        }
    }
    
}
