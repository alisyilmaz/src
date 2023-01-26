package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz.

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

        switch (secim.toUpperCase())
        {
            case "T": System.out.println("toplam = " + (s1 + s2)); break;
            case "Ç": System.out.println("farkı = " + (s1 - s2)); break;
            case "P": System.out.println("çarpımı = " + (s1 * s2)); break;
            case "B": System.out.println("bölme = " + ((double)s1 / s2)); break;
            default: System.out.println("Hatalı değer");
        }
    }
}
