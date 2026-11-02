package Pembelajaran_4_Array;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan04 {
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

        for (int i = 0; i < daftarOrang.size() - 1; i++) {
            for (int j = 0; j < daftarOrang.size() - 1 - i; j++) {
                String nama1 = daftarOrang.get(j).get(0);
                String nama2 = daftarOrang.get(j + 1).get(0);

                if (nama1.compareToIgnoreCase(nama2) > 0) {

                    ArrayList<String> temp = daftarOrang.get(j);
                    daftarOrang.set(j, daftarOrang.get(j + 1));
                    daftarOrang.set(j + 1, temp);
                }
            }
        }

        StringBuilder output = new StringBuilder("=== HASIL URUT ASCENDING (NAMA) ===\n\n");
        for (int i = 0; i < daftarOrang.size(); i++) {
            output.append(i + 1).append(". Nama    : ").append(daftarOrang.get(i).get(0)).append("\n")
                  .append("   Alamat  : ").append(daftarOrang.get(i).get(1)).append("\n")
                  .append("   No Telp : ").append(daftarOrang.get(i).get(2)).append("\n---------------------------------\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
