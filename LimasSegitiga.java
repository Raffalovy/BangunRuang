package bangunruang;
public class LimasSegitiga extends BangunRuang {
    float a;
    float ts;
    float tl;
    float tst;
    
    @Override
    float Volume(){
        float volume = 1/3 * (1/2 * a * ts) * tl;
        System.out.println("Volume Limas Segitiga: " + volume);
        return volume;
    }
    @Override
    float LuasPermukaan(){
        float LuasPermukaan = (1/2 * a * ts) + (3 * (1/2 * a * tst));
        System.out.println("LuasPermukaan LimasSegitiga: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
