package Gun24;

import java.util.HashSet;
import java.util.Random;

public class _sor {
    public static void main(String[] args) {
        HashSet<Integer> sayilar = new HashSet<>();

        // Random bir sayı üreteci tanımlayın
        Random r = new Random();

        // Set'i rastgele sayılarla doldurun
        while (sayilar.size() < 10) {
            sayilar.add(r.nextInt(20) + 1);
        }

        // Set'i yazdırın
        System.out.println(sayilar);
    }
}
    //Bu kodda, bir HashSet oluşturulur ve Random sınıfı kullanılarak 1 ile 20 arasındaki rastgele sayılarla doldurulur. Daha sonra, sayilar seti ekrana yazdırılır.

        //Not: Bu kod örneği sadece bir fikir vermek içindir ve çalışmayabilir. Eğer bu kodu kullanacaksanız, lütfen kodu dikkatlice inceleyin ve gerekli düzenlemeleri yapın.







