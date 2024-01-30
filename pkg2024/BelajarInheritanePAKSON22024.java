package belajarinheritanepakson2.pkg2024;

import java.util.Scanner;
public class BelajarInheritanePAKSON22024 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       BangunRuang bangunRuang = new BangunRuang();
        
        Bola bola = new bola();
        System.out.println("Masukkan Jari jari Bola : ");
        bola.r = input.nextFloat();
    }
}
