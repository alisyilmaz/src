package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("program başladı");

        for(int i=0; i<3;i++) {

            try { // hata bölgesini try{} ine aldık
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum=" + bolum);
            } catch (Exception hata)
            // hata mesalarını hata isimli Eception cinsinden değişkene attım
            {
                System.out.println("hata = " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz");
                i--;
            }

        }

        System.out.println("program bitti");
    }
}
