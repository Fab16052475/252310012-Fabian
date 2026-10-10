package praktikum1;
import java.util.Scanner;
public class Latihan_2 {
    public static void main(String[] args) {
        System.out.println("Aplikasi penghitung harga tanah Sinta");
        Tanah tanah = new Tanah();
        System.out.println("Masukkan luas tanah (m2) :");
        Scanner scanner = new Scanner(System.in);
        double luas = scanner.nextDouble();
        tanah.luas = luas;
        double totalHarga = tanah.hitungTotalHarga();
        System.out.println("Total harga tanah : Rp " + totalHarga);
        
        scanner.close();
    }
}