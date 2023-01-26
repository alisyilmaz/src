package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayi=");
        int s1 = oku.nextInt();

        System.out.print("2.Sayi=");
        int s2 = oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma  için P");
        System.out.println("Bölme   için B");
        System.out.print("Seçiminiz=");
        Scanner okuStr = new Scanner(System.in);
        String secim = okuStr.next();

        // merdivenli if, ladder if
        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (s1 + s2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Farkı = " + (s1 - s2));
              else
                  if (secim.equalsIgnoreCase("P"))
                      System.out.println("Çarpımı = " + (s1 * s2));
                  else
                      if (secim.equalsIgnoreCase("B"))
                         System.out.println("Bölümü = " + (s1 / s2));
                      else
                          System.out.println("Yanlış seçim");
    }
}
