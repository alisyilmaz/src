package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örneğin "Ismet Temur" I.T.  şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve soyadınız=");
        String adSoyad=oku.nextLine(); // adSoyad veri olarak alındı

        // Ismet Temur -> I.T.  -> I -> charAt(0) I.
        // indexOf(" ")-> boşluğun indexini veriyor, bunun 1 fazlası charAt() -> T yi verir
        char ilkHarf=adSoyad.charAt(0); // I
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1); // T

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

        // char soyadIlkHarf= adSoyad.charAt(adSoyad.indexOf(" ")+1);
    }
}
