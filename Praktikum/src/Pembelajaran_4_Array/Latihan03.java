package Pembelajaran_4_Array;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Latihan03 {
    public static void main(String[] args) {
       
        ArrayList<ArrayList<String>> daftarOrang = new ArrayList<>();

        int totalData = 3;

        for (int i = 0; i < totalData; i++) {
            ArrayList<String> baris = new ArrayList<>();

            JOptionPane.showMessageDialog(null, "Input Data Ke-" + (i + 1));
            String nama = JOptionPane.showInputDialog("Nama Lengkap:");
            String alamat = JOptionPane.showInputDialog("Alamat:");
            String telp = JOptionPane.showInputDialog("No Telp:");

            baris.add(nama);
            baris.add(alamat);
            baris.add(telp);

            daftarOrang.add(baris);
        }

        StringBuilder output = new StringBuilder("=== DATA BIODATA ===\n\n");
        for (int i = 0; i < daftarOrang.size(); i++) {
            output.append("Data ").append(i + 1).append(":\n")
                  .append("Nama    : ").append(daftarOrang.get(i).get(0)).append("\n")
                  .append("Alamat  : ").append(daftarOrang.get(i).get(1)).append("\n")
                  .append("No Telp : ").append(daftarOrang.get(i).get(2)).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
