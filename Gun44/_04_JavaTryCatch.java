package Gun44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try {
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

            // String kelime=""; // genel hataya düşmesi için yapıldı
            // kelime.charAt(3);

        }
        catch (InputMismatchException ex) // belirli bir hata
        {
            System.out.println("Lütfen sayı griniz");
        }
        catch (ArithmeticException ex) // belirli bir hata
        {
            System.out.println("Sıfıra bölme hatası");
        }
        catch (Exception ex) // belirli bir hata
        {
            System.out.println("hata oluştu"+ex.getMessage());
        }

        System.out.println("program bitti");
    }
}
