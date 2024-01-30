package bangunruang;
public class Bola extends BangunRuang {
    float r;
    
    @Override
    float Volume(){
       float Volume = 4 * (22 / 7) * r * r * r / 3;
        System.out.println("Volume Bola: " + Volume);
        return Volume;
    }
    @Override
    float LuasPermukaan(){
        float LuasPermukaan = 4 * (22 / 7) * r * r;
        System.out.println("LuasPermukaan Bola: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
