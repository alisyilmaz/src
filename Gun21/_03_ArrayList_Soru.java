package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        Boolean devam=false;
        do{
            // notu girecek
            System.out.print("Not=");
            int not= okuInt.nextInt();
            // notları arrayliste at
            notlar.add(not);
            // girilen notları topla
            toplam=toplam+not;
            //devam etmek istiyormusunuz (E/H)
            System.out.print("devam etmek istiyormusunuz (E/H)");
            String devamMi=okuStr.next();
            devam=devamMi.equalsIgnoreCase("E");
        }while(devam);

        // ortalamyı bul
        int ort= toplam / notlar.size();
        // geçen saysını bul;
        System.out.println("ort = " + ort);
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size() ; i++) {
            if (notlar.get(i) > ort)
                gecenSayisi++;
        }
        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}
