package Praktikum3;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama, jurusan;
		int umur;
		
		int konfirmasi;
		
		do {
			nama = jop.showInputDialog(null, "Masukkan Nama Anda: ", "Input Nama", jop.QUESTION_MESSAGE);
			konfirmasi = jop.showConfirmDialog(null, "Apakah benar nama Anda " + nama + "?");
		} while (konfirmasi !=0);
		
		jurusan = jop.showInputDialog(null, "Masukkan Jurusan: ");
		umur = Integer.parseInt(jop.showInputDialog(null, "Masukkan Umur: "));
		
		String output = "Nama Anda adalah: " + nama + "\n" +
						"Jurusan Anda: " + nama + "\n" +
						"Umur Anda: " + umur;
					jop.showMessageDialog(jop, output);
	}
}