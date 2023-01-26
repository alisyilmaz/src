package Gun39._05_OOP_Soru;

import Utility.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        List<IFood> siparisler = new ArrayList<>();
        Scanner oku = new Scanner(System.in);

        int secim = 0;
        do {
            menu();
            secim= oku.nextInt();

            switch (secim) {
                case 1:
                    IFood ak = new AdanaKebap();
                    siparisler.add(ak);
                    break;

                case 2:
                    Lahmacun lh = new Lahmacun();
                    siparisler.add(lh);
                    break;

                case 3:
                    IFood bo = new Borsh();
                    siparisler.add(bo);
                    break;

                case 4:
                    Palov pl = new Palov();
                    siparisler.add(pl);
                    break;
            }
        } while (secim < 5);

        System.out.println("Alınan Siparişler");
        for(IFood f: siparisler){
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparişleriniz hazırlanıyor..\n");
        MyFunc.Bekle(2);

        double toplam=0;
        for(IFood f: siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
            MyFunc.Bekle(2);
        }
        System.out.println("toplam ücret= " + toplam);

    }

    public static void menu(){
        System.out.print("\n****Menü*****" +
                "\n1-Adana Kebap (75 TL)" +
                "\n2-Lahmacun (20 TL)" +
                "\n3-Borsh (40 TL)" +
                "\n4-Palov (20 TL)" +
                "\n5-Tamam" +
                "\nSeçiminiz=");
    }
}
