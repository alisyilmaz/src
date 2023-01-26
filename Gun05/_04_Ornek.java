package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız=");
        String ad=oku.next();

        System.out.print("Soyadınız=");
        String soyad=oku.next();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Adınız ve soyadınız="+ad+" "+soyad);
    }
}
