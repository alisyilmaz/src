package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrenci notu=");
        int ogrNot= oku.nextInt();

        if (ogrNot >= 50)
            System.out.println("Geçtiniz");

        if (ogrNot < 50)
            System.out.println("Üzgünüz , kaldınız");
    }
}
