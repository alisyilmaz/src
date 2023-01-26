package Gun32._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Okul adını giriniz: ");
        String okulAd = scanner.nextLine();
        System.out.print("Okul kontenjanını giriniz: ");
        int kontenjan = scanner.nextInt();

        Okul okul = new Okul(okulAd, kontenjan);

        int ogrenciId = 1; // Öğrencilerin ID'lerini atamak için kullanacağımız değişken
        while (okul.getOgrenciler().size() < okul.getKontenjan()) {
            System.out.print("Öğrenci adı ve ");
            String ad = scanner.nextLine();
            System.out.print("soyadını giriniz: ");
            String soyad = scanner.nextLine();
            System.out.print("Öğrenci yaşını giriniz: ");
            int yas = scanner.nextInt();

            if (yas > 15) {
                System.out.println("Lütfen 15 yaşını geçmeyen bir öğrenci giriniz.");
                continue;
            }

            Ogrenci ogrenci = new Ogrenci(ad, soyad, yas);
            ogrenci.setID(ogrenciId); // Öğrenciye ID ataması yapıyoruz
            ogrenciId++; // Öğrenci ID'lerini artırmak için değişkeni bir arttırıyoruz

           // okul.ogrenciEkle(ogrenci);
        }

        System.out.println(okul.getOkulAd() + " okulunda eklenen öğrenciler: ");
        for (Ogrenci ogrenci : okul.getOgrenciler()) {
            System.out.println("ID: " + ogrenci.getID() + ", Ad: " + ogrenci.getAd() + ", Soyad: " + ogrenci.getSoyad() + ", Yaş: " + ogrenci.getYas());
            }
        }
    }

