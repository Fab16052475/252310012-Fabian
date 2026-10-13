package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Memasukan Usia : ");
        String usia = input.nextLine();
        
        System.out.print("Memasukan Firstname : ");
        String firstname = input.nextLine();
        
        System.out.print("Memasukan Lastname : ");
        String lastname = input.nextLine();
        
        System.out.print("Memasukan NPM : ");
        String npm = input.nextLine();
        
        
        String hasil = usia.concat(firstname).concat(lastname).concat(npm);
        
        System.out.println("Output: " + hasil);
        
        input.close();
    }
}