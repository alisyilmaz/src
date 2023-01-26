package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {

            Ogrenci ogr = new Ogrenci();
            System.out.print("Öğrenci Adı=");  ogr.adi = okuStr.nextLine();
            System.out.print("Öğrenci Soydı=");  ogr.soyadi = okuStr.nextLine();
            System.out.print("Öğrenci Sinifi=");  ogr.sinifi = okuInt.nextInt();
            System.out.print("Öğrenci Adresi=");  ogr.adres = okuStr.nextLine();

            snf.add(ogr);
        }

        for(Ogrenci ogr : snf)
        {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);
        }

    }
}


class Ogrenci{
    // properties, field, özellik
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}
