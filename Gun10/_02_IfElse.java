package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        // 2 tane sınav oldun. topla 2 ye böl (ortalaması)
        // final kelimesi java ya ait kelime

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize=");
        double vizeNotu=oku.nextDouble();

        System.out.print("Final=");
        double finalNotu=oku.nextDouble();

        double ort= (vizeNotu+finalNotu)/2;

        if (ort >= 60) {
            System.out.println("tebrikler geçtiniz");
        }
        else {
            System.out.println("Kaldınız");
        }

        // Süslü parantez kuralı:  sadece 1 satır(;) çalışacak ise zorunlu değil,
        // birden fazla ise zorunlu. Her zaman koyulabilir, hiç bir mahsuru yok
    }
}
