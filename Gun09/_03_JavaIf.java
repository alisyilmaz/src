package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi 1 =");
        int sayi1=oku.nextInt();

        System.out.print("Sayi 2 =");
        int sayi2=oku.nextInt();

        if (sayi1 > sayi2) //burdaki normal parantezler şart , olacak
            System.out.println("Sayi 1 büyüktür "+sayi1);

        if (sayi1 < sayi2)
        { // opsiyonel olan süslü parantezdir
            System.out.println("Sayi 2 büyüktür ");
            System.out.println("sayi2 = " + sayi2);
        }

        if (sayi1 == sayi2)
            System.out.println("Sayi 1 Sayi2 eşittir");
    }
}
