package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal ifadeler
        //  &&  ve işaretimiz (shift-6)
        //  ||  veya işaretimiz ((altGr  <)


        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

       // hem tek hem pozitif  -> sayi%2==1 && sayi > 0

       if ( sayi%2==1 && sayi>0  ) {
           System.out.println("uygun sayı girildi");
       }
       else {
           System.out.println("uygun sayı GİRİLMEDİ");
       }


    }
}
