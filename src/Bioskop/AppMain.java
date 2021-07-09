/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bioskop;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int judul, jumlah, bayar;
        String noKursi;
        System.out.println("================================");
        System.out.println("     Pemesanan TIket Bioskop    ");
        System.out.println("================================");
        System.out.println("Judul Film : ");
        System.out.println("1. Danur 3");
        System.out.println("2. Pretty Boys");
        System.out.println("3. IT");
        System.out.println("---------------");
        System.out.print("Pilih : ");
        judul = input.nextInt();
        switch(judul){
            case 1:
                System.out.println("================================");
                System.out.println("             Danur 3"            );
                System.out.println("================================");
                System.out.print("Jumlah Penonton : ");
                jumlah = input.nextInt();
                System.out.print("Pilih No Kursi : ");
                noKursi = input.next();
                System.out.print("Jumlah Pembayaran : ");
                bayar = input.nextInt();
                Danur3 D3 = new Danur3("Horor", 85,35000,noKursi,jumlah,bayar);
                System.out.println();
                D3.Display();
                System.out.println();
                D3.favorit();
                D3.favorit("Sekuel");
                System.out.println();
                D3.total();
                D3.pembayaran();
                break;
            case 2: 
                System.out.println("================================");
                System.out.println("           Pretty Boys          ");
                System.out.println("================================");
                System.out.print("Jumlah Penonton : ");
                jumlah = input.nextInt();
                System.out.print("Pilih No Kursi : ");
                noKursi = input.next();
                System.out.print("Jumlah Pembayaran : ");
                bayar = input.nextInt();
                PrettyBoys PB = new PrettyBoys("Drama,Komedi",70,35000,noKursi,jumlah,bayar);
                System.out.println();
                PB.Display();
                System.out.println();
                PB.favorit();
                System.out.println();
                PB.total();
                PB.pembayaran();
                break;
            case 3:
                System.out.println("================================");
                System.out.println("          Pretty Boys           ");
                System.out.println("================================");
                System.out.print("Jumlah Penonton : ");
                jumlah = input.nextInt();
                System.out.print("Pilih No Kursi : ");
                noKursi = input.next();
                System.out.print("Jumlah Pembayaran : ");
                bayar = input.nextInt();
                IT IT = new IT("Horor",79,35000,noKursi,jumlah,bayar);
                System.out.println();
                IT.Display();
                System.out.println();
                IT.favorit();
                IT.favorit("Sekuel");
                System.out.println();
                IT.total();
                IT.pembayaran();
                break;
            default: 
                System.out.println("Maaf Film Belum Tersedia");
                break;
        }
    }
    
}
