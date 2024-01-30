package bangunruang;
public class Balok extends BangunRuang {
    float p;
    float l;
    float t;
    
    @Override
    float Volume(){
       float Volume = p * l * t;
        System.out.println("Volume Balok: " + Volume);
        return Volume;
    }
    @Override
    float LuasPermukaan(){
        float LuasPermukaan = 2 * (p * l + p * t + l * t);
        System.out.println("LuasPermukaan Balok: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
