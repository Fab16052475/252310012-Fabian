package Quiz1;

import javax.swing.JOptionPane;

public class RemedQuiz {
	public static void main(String [] args) {
		// Meminta Jumlah Data Awal
		String teksData = JOptionPane.showInputDialog("Input Berapa Data: ");
		int data = Integer.parseInt(teksData);
		
		int total = 0;
		
		// Memeluai Perulangan
		for (int i = 0; i < data; i++) {
			String teksAngka = JOptionPane.showInputDialog("Input Angka:");
			int angka = Integer.parseInt(teksAngka);
		
			total = total + angka;	
		}
		
		double rataRata = (double) total / data;
		JOptionPane.showMessageDialog(null, "Nilai Rata ratanya adalah: " + rataRata);
	}
	
}