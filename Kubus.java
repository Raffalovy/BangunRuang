package bangunruang;
public class Kubus extends BangunRuang {
    float s;
    
    @Override
    float Volume(){
       float Volume = s * s * s;
        System.out.println("Volume Kubus: " + Volume);
        return Volume;
    }
    @Override
    float LuasPermukaan(){
        float LuasPermukaan = 6 * s * s;
        System.out.println("LuasPermukaan Kubus: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
