package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan02 {
public static void main(String[] args) {

        String inputNama = JOptionPane.showInputDialog("Masukkan Fullname:");
        String inputUsia = JOptionPane.showInputDialog("Masukkan Usia:");
        String inputAlamat = JOptionPane.showInputDialog("Masukkan Alamat:");

        int angkaUsia = Integer.parseInt(inputUsia);

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

