
package belajarinheritanepakson2.pkg2024;

public class Kubus extends BangunRuang{

    float sisi;
    
    @Override
    float luasPermukaan(){
        float luasPermukaan = sisi * sisi * sisi;
        System.out.println("Luas Permukaan Kubus : " +luasPermukaan);
        return luasPermukaan;
    }
    
    
    @Override
    float volume(){
        float volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " +volume);
        return volume;
    }
}
