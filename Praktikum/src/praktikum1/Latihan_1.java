package praktikum1;

import java.util.Scanner;

public class Latihan_1 {
	public static void main(String[] args) {
	System.out.println("Aplikasi penghitung volume kubus");
	Kubus kubus = new Kubus();
	System.out.println("Masukkan sisi kubus :");
	Scanner scanner = new Scanner(System.in);
	int sisi = scanner.nextInt();
	kubus.sisi = sisi;
	
	int volume = kubus.hitungVolume();
	System.out.println("Volume dari kubus:"+volume);
	}
}
