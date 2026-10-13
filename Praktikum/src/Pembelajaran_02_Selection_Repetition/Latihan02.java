package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM Anda: ");
        long npm = input.nextLong();
        
        boolean isPrima = true;
        
        if (npm <= 1) {
            isPrima = false;
        } else {
            for (long i = 2; i <= Math.sqrt(npm); i++) {
                if (npm % i == 0) {
                    isPrima = false;
                    break;
                }
            }
        }
        
        if (isPrima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
        }
        
        input.close();
    }
}