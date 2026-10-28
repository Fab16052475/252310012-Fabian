package Praktikum5;

public class Array2D {
	public static void main(String [] args) {
		int[][] angka = new int[2][2];
		angka[0][0] = 10; // cara masukin data
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(angka[i][j]);
			}
		}
		// deklarasi dengan data yang sudah ada
		int[][] data = {
				{1, 2, 21},
				{3, 4, 44},
				{7, 2, 6}
		};
	}
}
