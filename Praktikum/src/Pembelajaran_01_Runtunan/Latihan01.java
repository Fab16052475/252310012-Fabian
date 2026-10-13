package Pembelajaran_01_Runtunan;

public class Latihan01 {
	public static void main(String[] args) {
        
        double celcius = 30.0; 

        
        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        
        System.out.println("=== Program Konversi Suhu ===");
        System.out.println("Suhu Awal Celcius : " + celcius + " °C");
        System.out.println("Suhu Fahrenheit   : " + fahrenheit + " °F");
        System.out.println("Suhu Reamur       : " + reamur + " °R");
        System.out.println("Suhu Kelvin       : " + kelvin + " K");
    }
}
