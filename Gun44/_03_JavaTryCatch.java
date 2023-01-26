package Gun44;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program Çalışmaya Başladı");

        try {  // dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        }  // hata olduğu zaman programı kırma
        catch (Exception ex)
        // ex isimli değişkende oluşan hataların bilgisi atanıyor
        {  // hata olduğunda yapılması istenenler buraya yazılıyor
            System.out.println(" hata oluştu, lütfen tekrar deneyiniz");
            System.out.println("Tüm hata mesajı ="+ex);
            System.out.println("Hatanın açıklaması="+ex.getMessage());
            // kendine hata mesajını mail atabilirsin
            // log tutma : program nasıl çalışıyor, hata loglarını DB yazabilirsiniz
        }

        System.out.println("program bitti");

        try {
            // Java ve Toolları çalışmaya devam et
            // Konuları öğrenmeye ve çalışmaya devam
            // anlamadığın yer mi oldu? kırılmadan devam et.
        }
        catch (Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan decam et
            // unutma sen bir söz verdin, DEVAM
        }

        // sonunda seni güzel bir meslek bekliyor.
    }
}