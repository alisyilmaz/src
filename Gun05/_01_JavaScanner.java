package Gun05;


import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi    adı    ilk değeri     işlem tamam bu adımı çalıştır
           int    sayi    = 0  ;

          Scanner okuyucu = new Scanner(System.in);
        //tipi      adı     yeni okuyucu (klavyeden - konsoldan)

        System.out.print("Sayi giriniz=");
        sayi = okuyucu.nextInt(); // kursor bekliyor sayı girişi için
        // rakam girilip entara basıldığında değeri alıp sayi ya atıyor.

        System.out.println("sayi = " + sayi);
    }
}
