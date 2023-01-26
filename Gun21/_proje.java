package Gun21;

import java.util.Scanner;

public class _proje {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        String devam_y;
        String sifre;
        String sifreTekrar;
        String kullanici_adi;

        System.out.print("Kayıt İçin Adınızı Girin : ");
        String isim = oku.nextLine();

        System.out.print(isim.substring(0, 1).toUpperCase() + isim.substring(1) + " " + "Soy Adınızı Girin : ");
        String soyİsim = oku.nextLine();


        do {

            System.out.print(isim.substring(0, 1).toUpperCase() + isim.substring(1) + " " + soyİsim.substring(0, 1).toUpperCase() + soyİsim.substring(1) + " " + "İsminiz Doğru ise 'Y' tuşuna Basınız : ");
            devam_y = oku.nextLine();
            if (devam_y.equalsIgnoreCase("y") == true) {
                System.out.print("Kayıt İşlemi Başarılı  \n");
                break;
            }
            System.out.print("Lütfen Doğru Seçim Yapınız!\n");

        }
        while (devam_y.equalsIgnoreCase("y") != true) ;

        System.out.print("Kullanıcı adınızı belirleyin : ");
        kullanici_adi = oku.nextLine();
        System.out.println("Kullanıcı Adınız : "+kullanici_adi);

        System.out.print("Şifrenizi belirleyiniz : ");
        sifre = oku.nextLine();


        for (int i = 0; i < 3; i++) {
            System.out.print("Şifrenizi tekrar giriniz : ");
            sifreTekrar = oku.nextLine();

            if (sifre.equals(sifreTekrar) == true) {
                System.out.print("Tebrikler...  \n" + kullanici_adi +" "+"kullanıcı adıyla sisteme kayıt oldunuz");
                break;
            }
            System.out.print("Hatalı bir şifre girdiniz, \nLütfen tekrar deneyiniz\n");
        }

    }
}
