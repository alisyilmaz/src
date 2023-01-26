package Gun06;

import java.util.Scanner;

// Girilen bir stringin sadece son Harfini yazdırınız.
public class _04_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Bir cümle giriniz=");
        String cumle=oku.nextLine();

        //   01234 -> harflerin oda numaraları : index
        //   bugun  -> son harfin oda numarası UZUNLUĞUN NESİ ? 1 eksiği
        int uzunluk=cumle.length();
        char sonHarf= cumle.charAt(uzunluk-1);

        System.out.println("sonHarf = " + sonHarf);

        //2.Yöntem
        System.out.println("son Harf="+ cumle.charAt( cumle.length()  -1)   );
    }
}
