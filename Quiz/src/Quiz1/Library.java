package Quiz1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Library{
	 public static void main(String[] args) {
	        ArrayList<String> dataBuku = new ArrayList<>();
	        String pilihan;
			}
	        
	        do {
	        	String menu = "=== PILIH MENU ===\n"
	                + "1. Masukkan Judul Buku\n"
	                + "2. Hapus Buku (Index)\n"
	                + "3. Output Seluruh Data Buku\n"
	                + "4. Keluar dari Program\n\n"
	                + "Masukkan pilihan (1-4):";
	        }
	        pilihan = JOptionPane.showInputDialog(null, menu);


	        if (pilihan == null) {
	        break;
	        }
}