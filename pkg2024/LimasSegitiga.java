package belajarinheritanepakson2.pkg2024;

public class LimasSegitiga extends BangunRuang{
    float a;
    float tS;
    float tL;
    
    @Override
    float luasPermukaan(){
        float luasPermukaan = a * tS;
        System.out.println("Luas Persegi Panjang : " +luasPermukaan);
        return luasPermukaan;
    }
    
    @Override
    float volume(){
        float volume = 1/3 * a * tL;
        System.out.println("Keliling Persegi Panjang : " +volume);
        return volume;
    }
    
}
