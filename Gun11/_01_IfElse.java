package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir tam sayının pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz=");
        int sayi=oku.nextInt();

        if (sayi > 0)
        {
            System.out.println("pozitif");
        }
        else  // ya sıfırdır ya da negatidir
        {
             if (sayi < 0)  // parayla değil , istediğin kadar kullan
                 System.out.println("negatif");
             else
                 System.out.println("Sıfır");
        }

        /********************************/
        if (sayi> 0)
            System.out.println("pozitif");

        if (sayi<0)
            System.out.println("negatif");

        if (sayi==0)
            System.out.println("sıfır");




    }
}
