package Pembelajaran_01_Runtunan;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Toko_Serba_Guna {
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("=========================================================");
        System.out.println("                  TOKO SERBAGUNA IBIK");
        System.out.println("=========================================================");
        
        
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();
        
        
        LocalDateTime waktuSekarang = LocalDateTime.now();
        
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", new Locale("id", "ID"));
        String waktuCetak = waktuSekarang.format(formatWaktu);
        
       
        int hargaSatuan = 6300;
        int totalHarga = qty * hargaSatuan;
        
        int kelipatan = qty / 3;
        int persenDiskon = kelipatan * 5;
        
        double nominalDiskon = totalHarga * (persenDiskon / 100.0);
        double subTotal = totalHarga - nominalDiskon;
        
        
        System.out.println();
        System.out.println(waktuCetak);
        System.out.printf("%-15s %-10s %-15s %s\n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("=========================================================");
        
       
        String strHarga = "Rp " + hargaSatuan + ",-";
        String strTotal = "Rp " + totalHarga;
        
        System.out.printf("%-15s %-10d %-15s %s\n", "ROTI ENAK.", qty, strHarga, strTotal);
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Diskon : " + persenDiskon + "%");
        
        System.out.println("Sub Total : Rp " + (int)subTotal + ",-");
        
        
        input.close();
    }
}
