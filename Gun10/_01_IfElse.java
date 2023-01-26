package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int ogrNot= oku.nextInt();

        // 1.Yöntem (Önceki)
        if (ogrNot >= 50)
            System.out.println("Geçtiniz");

        if (ogrNot<50)
            System.out.println("Kaldınız.");


        // 2.Yöntem olması gereken
        if (ogrNot >= 50) { // herzaman tek bir kontrol yapar   : baklava dilimi
            System.out.println("Geçtiniz");  // evet
            System.out.println("tebrikler");
        }
        else {  // değilse yapılacaklar
            System.out.println("Kaldınız");  //hayır
        }

    }
}
