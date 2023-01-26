package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        System.out.println( sayi==0 ? "sıfır" : (sayi>0 ? "poz" : "neg") );

    }
}
