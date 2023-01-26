package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _Soru_ {
    public static void main(String[] args) {
        Scanner okuInt = new Scanner(System.in);
        Scanner okustr = new Scanner(System.in);

        Map<String, String> sozluk = new TreeMap<>();
        int islem = 0;
        do {
            System.out.println("1- Ekleme\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\nSeçiminiz");
            System.out.print("Yapmak istediğiniz işlem =");
            islem = okuInt.nextInt();
            System.out.println();

            switch (islem) {
                case 1: {
                    System.out.println("Ekleme işlemi seçildi...");
                    System.out.print("Kelime :");
                    String kelime = okustr.nextLine();
                    System.out.print("Manası :");
                    String mana = okustr.nextLine();
                    sozluk.put(kelime, mana);
                    System.out.println();
                    continue;
                }
                case 2: {
                    System.out.println("Düzenleme işlemi seçildi...");
                    System.out.print("Kelime :");
                    String kelime = okustr.nextLine();
                    System.out.println("Manası :" + sozluk.get(kelime));
                    System.out.print("Yeni Manası :");
                    String yenimana = okustr.nextLine();
                    sozluk.put(kelime, yenimana);
                    System.out.println();
                    continue;
                }
                case 3: {
                    System.out.println("Listeleniyor...");
                    for (Map.Entry<String, String> anlam : sozluk.entrySet()) {
                        System.out.println(anlam.getKey() + " - " + anlam.getValue());
                    }
                    System.out.println();
                    continue;
                }
                case 4: {
                    System.out.print("Aranacak Kelimeyi Seçiniz = ");
                    String aranacak = okustr.nextLine();
                    sozluk.get(aranacak);
                    System.out.println(aranacak + "=" + sozluk.get(aranacak));
                    break;
                }
                case 5:
                    System.out.print("Silinecek Kelimeyi Seçiniz = ");

                    String silinecek = okustr.nextLine();
                    sozluk.remove(silinecek);
                    System.out.println("Silindi." + sozluk.remove(silinecek));
                    break;
                case 6:
                    System.out.print("Çıkış İşlemi Başarılı");



            }


        } while (islem != 6);
    }
}

