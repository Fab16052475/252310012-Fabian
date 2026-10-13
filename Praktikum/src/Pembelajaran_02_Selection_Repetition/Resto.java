package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;


public class Resto {

 private Long Harga;

 
 private Long getPrices(int pilihan) {
     if (pilihan == 1) {
         Harga = 22000L;
     } else if (pilihan == 2) {
         Harga = 15000L;
     } else if (pilihan == 3) {
         Harga = 25000L;
     } else {
         Harga = 0L;
     }
     return Harga; 
 }

 
 public void chooseMenu(Scanner input) {
     System.out.println("Menu Sarapan:");
     System.out.println("1. Nasi Goreng");
     System.out.println("2. Bubur Ayam");
     System.out.println("3. Soto Ayam");
     System.out.print("Pilihan Anda (1-3): ");
     int pilihan = input.nextInt();

     
     Long hargaTercetak = getPrices(pilihan);

     if (pilihan == 1) {
         System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + hargaTercetak + ",-");
     } else if (pilihan == 2) {
         System.out.println("Anda memesan Bubur Ayam dengan harga Rp" + hargaTercetak + ",- ");
     } else if (pilihan == 3) {
         System.out.println("Anda memesan Soto Ayam dengan harga Rp " + hargaTercetak + ",- ");
     } else {
         System.out.println("Maaf menu yang anda masukan salah.");
     }
 }
}