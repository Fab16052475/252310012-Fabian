package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        
       
        String inputNama = JOptionPane.showInputDialog("Masukkan Fullname:");
        if (inputNama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong");
            return;
        }

        String inputUsia = JOptionPane.showInputDialog("Masukkan Usia:");
        if (inputUsia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong");
            return;
        }

        int angkaUsia = 0;
        try {
            angkaUsia = Integer.parseInt(inputUsia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Isian usia harus angka");
            return;
        }

        String inputAlamat = JOptionPane.showInputDialog("Masukkan Alamat:");
        if (inputAlamat.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong");
            return;
        }

        if (inputAlamat.length() < 10) {
            JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter");
            return;
        }

        Biodata dataKu = new Biodata();
        dataKu.setFullname(inputNama);
        dataKu.setUsia(angkaUsia);
        dataKu.setAlamat(inputAlamat);

        String hasil = "Fullname : " + dataKu.getFullname() + "\n" +
                       "Usia : " + dataKu.getUsia() + "\n" +
                       "Alamat : " + dataKu.getAlamat();

        JOptionPane.showMessageDialog(null, hasil);
    }
}
