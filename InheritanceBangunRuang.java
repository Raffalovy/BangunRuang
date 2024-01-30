package bangunruang;

import java.util.Scanner;

public class InheritanceBangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Bola bola = new Bola();
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        LimasSegitiga lsst = new LimasSegitiga();
        BangunRuang Bangunruang = new BangunRuang();
        
        System.out.println("1. Volume Bola");
        System.out.println("2. Luas Permukaan bola");
        System.out.println("3. Volume Kubus");
        System.out.println("4. Luas Permukaan Kubus");
        System.out.println("5. Volume Balok");
        System.out.println("6. Luas Permukaan Balok");
        System.out.println("7. Volume Limas Segitiga");
        System.out.print("Yang ingin dihitung : ");
        int pilih = scanner.nextInt();
        
        switch(pilih) {
            case 1:
                System.out.print("Masukkan Jari jari : ");
                bola.r = scanner.nextFloat(); 
                bola.Volume();
                break;
                
            case 2:
                System.out.print("Masukkan Jari jari : ");
                bola.r = scanner.nextFloat();
                bola.LuasPermukaan();
                break;
                
            case 3:
                System.out.print("Masukkan Sisi : ");
                kubus.s = scanner.nextFloat();
                kubus.Volume();
                break;
                
            case 4:
                System.out.print("Masukkan Sisi : ");
                kubus.s = scanner.nextFloat();
                kubus.LuasPermukaan();
                break;
                
            case 5:
                System.out.print("Masukkan Panjang : ");
                balok.p = scanner.nextFloat();
                System.out.print("Masukkan Lebar : ");
                balok.l = scanner.nextFloat();
                System.out.print("Masukkan Tinggi : ");
                balok.t = scanner.nextFloat();
                balok.Volume();
                break;
                
            case 6:
                System.out.print("Masukkan Panjang : ");
                balok.p = scanner.nextFloat();
                System.out.print("Masukkan Lebar : ");
                balok.l = scanner.nextFloat();
                System.out.print("Masukkan Tinggi : ");
                balok.t = scanner.nextFloat();
                balok.LuasPermukaan();
                break;
                
            case 7:
                System.out.print("Masukkan Alas : ");
                lsst.a = scanner.nextFloat();
                System.out.print("Masukkan Tinggi Limas : ");
                lsst.tl = scanner.nextFloat();
                System.out.print("Masukkan Tinggi Segitiga : ");
                lsst.ts = scanner.nextFloat();
                lsst.Volume();
                break;
        }
    }
}
