package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM Anda: ");
        long npm = input.nextLong();
        
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();
        
        if (npm % 2 == 0) {
           
            for (int i = row; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 1 + 2 * (row - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
           
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 1 + 2 * (row - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        } else {
           
            int i = row;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                int spaces = 1 + 2 * (row - i);
                int s = 1;
                while (s <= spaces) {
                    System.out.print(" ");
                    s++;
                }
                j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i--;
            }
            
          
            i = 1;
            while (i <= row) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                int spaces = 1 + 2 * (row - i);
                int s = 1;
                while (s <= spaces) {
                    System.out.print(" ");
                    s++;
                }
                j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
        input.close();
    }
}
