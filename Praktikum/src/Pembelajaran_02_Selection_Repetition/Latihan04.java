package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM Anda: ");
        long npm = input.nextLong();
        
        System.out.print("Masukkan nilai factor (minimal 20): ");
        int factor = input.nextInt();
        
       
        if (factor < 20) {
            System.out.println("Nilai inputan factor tidak boleh kurang dari 20.");
        } else {
            System.out.print("Faktor " + factor + " adalah ");
            
            boolean isGenap = (npm % 2 == 0);
            boolean first = true;
            
            if (isGenap) {
                
                for (int i = 1; i <= factor; i++) {
                    if (factor % i == 0) {
                        if (!first) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        first = false;
                    }
                }
            } else {
               
                for (int i = factor; i >= 1; i--) {
                    if (factor % i == 0) {
                        if (!first) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        first = false;
                    }
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}
