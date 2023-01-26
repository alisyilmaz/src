package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program çalışmaya başladı");

        try {  // dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        }// hata olduğu zaman programı kırma
        catch (Exception ex)
        // ex isimli değişkende oluşan hataların bilgisi atanıyor
        {//hata oldugunda yapılması istenenler buraya yazılıyor
            System.out.println("hata oluştu, lütfen tekrar deneyeniz");
            System.out.println("Tüm hata mesajı ="+ex);
            System.out.println("Hatanın açıklaması="+ex.getMessage());
            // kendine hata mesajını kendine mail atabilirsin
            //log tutma : program nasıl çalışıyor, hata loglarını harddiske yazabilirsin
        }
        System.out.println("program bitti");

        try {
            // Java ve Tolları çalışmaya devam et
            // Konuları öğrenmeye ve çalışmaya devam
        }   // anlamadığın yer mi oldu ? kırılmadan devam et:
        catch(Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin , DEVAM
        }

        //sonunda seni güzel bir meslek bekliyor.
    }
}
