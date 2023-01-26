package Gun09;

import java.util.Scanner;

public class _08_JavaIf_2 {
    public static void main(String[] args) {

        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

//        Scanner oku=new Scanner(System.in);
//        System.out.print("Şifreniz = ");
//        String sifre=oku.next().trim();
//
//        System.out.print("Şifreniz tekrar = ");
//        String sifreTekrar=oku.next().trim();

        String sifre="merhaba1";
        String sifreTekrar="merhaba1";

        System.out.println("sifre = " + sifre);
        System.out.println("sifreTekrar = " + sifreTekrar);
        System.out.println("sifreTekrar.length() = " + sifreTekrar.length());
        System.out.println("sifre.length() = " + sifre.length());

        if (sifre == sifreTekrar)
            System.out.println("AYNI");

        if (sifre != sifreTekrar)
            System.out.println("DEĞİL");

    }
}
