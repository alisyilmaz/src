package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<Ogrenci> snf=new ArrayList<>();
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for(int i=1 ; i<=3 ;i++) {

            Ogrenci ogr = new Ogrenci();
            System.out.print("Öğrenci Adı=");
            ogr.adi = okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");
            ogr.soyadi = okuStr.nextLine();
            System.out.print("Öğrenci Sınıfı=");
            ogr.sinifi = okuInt.nextInt();
            System.out.print("Öğrenci Adresi=");
            ogr.adres = okuStr.nextLine();

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
