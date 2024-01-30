/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarinheritanepakson2.pkg2024;


public class Balok extends BangunRuang{
    float p;
    float l;
    float t;
    
    
    @Override
    float luasPermukaan (){
        float luasPermukaan = 2 *(p + l + t);
        System.out.println("Luas Permukaaan Balok : " +luasPermukaan);
        return luasPermukaan;
    }
    
    @Override
    float volume (){
        float volume = p * l *t;
        System.out.println("Keliling Persegi Panjang : " +volume);
        return volume;
}
}