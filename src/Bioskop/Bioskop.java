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
public class Bioskop {
    protected String genre;
    protected double rating;
    protected int harga;
    protected String noKursi;
    protected int jumlah;
    protected int bayar;
    
    public Bioskop(String genre, double rating, int harga, String noKursi, int jumlah, int bayar){
        this.genre = genre;
        this.rating = rating;
        this.harga = harga;
        this.noKursi = noKursi;
        this.jumlah = jumlah;
        this.bayar = bayar;
    }
    public void Display(){
        System.out.println("Film Belum Ditayangkan");
    }
    public void total(){
        System.out.println("Film Belum Bisa Dipesan");
    }
    public void pembayaran(){
        System.out.println("Film Belum Bisa Dipesan");
    }
    public void favorit(){
        System.out.println("Film Belum Ditayangkan");
    }
}
