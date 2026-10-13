package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan03 {
    
    
    static final double PI = 3.14159;
    static String statusProgram = "Kalkulasi Berhasil";

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan digit terakhir NPM kamu: ");
        int digitNpm = input.nextInt();

        System.out.println("\n=== Hasil Perhitungan ===");

        if (digitNpm % 2 != 0) {
           
            System.out.println("[Kategori Ganjil Terpilih]\n");
            
           
            hitungSegitiga(6.0, 8.0, 6.0, 8.0, 10.0);
            hitungKerucut(7.0, 24.0, 25.0);
            
         
            double volumeTab = hitungVolumeTabung(7.0, 10.0);
            System.out.println("Volume Tabung: " + volumeTab);
            
        } else {
           
            System.out.println("[Kategori Genap Terpilih]\n");
            
      
            hitungLayangLayang(10.0, 12.0, 5.0, 8.0);
            
            
            double volumePrisma = hitungVolumePrismaSegitiga(6.0, 8.0, 15.0);
            System.out.println("Volume Prisma Segitiga: " + volumePrisma);
        }
        
        System.out.println("\nStatus: " + statusProgram); 
        input.close();
    }

    
    public static void hitungSegitiga(double alas, double tinggi, double s1, double s2, double s3) {
       
        double luas = 0.5 * alas * tinggi;
        double keliling = s1 + s2 + s3;
        
        System.out.println("- Segitiga -");
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling + "\n");
    }

    public static void hitungKerucut(double jariJari, double tinggi, double garisPelukis) {
      
        double volume = (1.0 / 3.0) * PI * jariJari * jariJari * tinggi;
        double luasPermukaan = PI * jariJari * (jariJari + garisPelukis);
        
        System.out.println("- Kerucut -");
        System.out.println("Volume: " + volume);
        System.out.println("Luas Permukaan: " + luasPermukaan + "\n");
    }

    public static void hitungLayangLayang(double d1, double d2, double s1, double s2) {
        double luas = 0.5 * d1 * d2;
        double keliling = 2 * (s1 + s2);
        
        System.out.println("- Layang-layang -");
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling + "\n");
    }

   

    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        
        double volume = PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static double hitungVolumePrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma) {
        double luasAlas = 0.5 * alasSegitiga * tinggiSegitiga;
        double volume = luasAlas * tinggiPrisma;
        return volume;
    }
}
    
