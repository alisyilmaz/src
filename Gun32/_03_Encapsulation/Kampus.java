package Gun32._03_Encapsulation;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu", 3); // maxOgr 3

        do{
            System.out.print("Öğrenci Adı=");String ad=okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");String soyad=okuStr.nextLine();
            System.out.print("Öğrenci Yaşı=");int yas=okuInt.nextInt();

           if (yas < 15)
           {
               Ogrenci ogr=new Ogrenci(ad,soyad,yas);
               yeniOkul.getOgrenciler().add(ogr);
           }
           else
           {
               System.out.println("Öğrenci yaşı okul için uyugn değil");
           }
        }while(yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan() );

        System.out.println("Ogrenciler = " + yeniOkul.getOgrenciler());
    }
}
