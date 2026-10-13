package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto(); 
        String ulang;

        do {
            
            resto.chooseMenu(input);

            System.out.print("Apakah anda akan memesan kembali ? (y/n) ");
            ulang = input.next();
            System.out.println();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terimakasih telah memesan.");
        input.close();
    }
}