/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarinheritanepakson2.pkg2024;

public class Bola extends BangunRuang {
    float r;
    
    @Override
    float luasPermukaan (){
        float luasPermukaan = (float) (Math.PI * r * r);
        System.out.println("Luas Persegi : " +luasPermukaan);
        return luasPermukaan;
    }
    
    
    @Override
    float volume (){
        float volume =(float)(4/3 * Math.PI * r * r);
        System.out.println("Keliling Persegi : " +volume);
        return volume;
    
}
}