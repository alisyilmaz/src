package Gun30._02_FinalVariables.Ornek2;

import Gun30._02_FinalVariables.Ornek1.Vatandas;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun;
        int saat ;
        int dakika ;

        Scanner oku = new Scanner(System.in);
        System.out.print("gun = ");
        gun = oku.nextInt();
        System.out.print("saat = ");
        saat = oku.nextInt();
        System.out.print("dakika = ");
        dakika = oku.nextInt();


        int toplamSaniye =
                gun
                *Sabitler.birGundekiSaatSayisi
                *Sabitler.birSattekiDakikaSayisi
                *Sabitler.birDakikadakiSanSayisi
                +
                        saat
                *Sabitler.birSattekiDakikaSayisi
                *Sabitler.birDakikadakiSanSayisi
                +
                        dakika
                *Sabitler.birDakikadakiSanSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);
        
        // 2,yontem
        System.out.println("Sabitler.hesapla(gun,saat,dakika) = " + Sabitler.hesapla(gun,saat,dakika));


    }

}

