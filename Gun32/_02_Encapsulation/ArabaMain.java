package Gun32._02_Encapsulation;

import java.util.Scanner;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Model giriniz=");

        Araba arb1=new Araba();
        arb1.setModel(oku.nextInt());
        arb1.setKapiSayisi(5);
        arb1.setModel(2022);
        arb1.setRenk("kirmizi");
        arb1.setMotorHacmi(1599);
        System.out.println("arb1 = " + arb1);

        Araba arb2=new Araba("mavi", 2030, 1600, 4);
        System.out.println("arb2 = " + arb2);

        int arabaModeli = arb1.getModel();

    }


    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani Kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.

}
