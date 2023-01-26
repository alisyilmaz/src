package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner oku=new Scanner(System.in);

        System.out.print("dikdörtgenin Kısa Kenari=");
        int kisaKenar= oku.nextInt();

        System.out.print("dikdörtgenin Uzun Kenari=");
        int uzunKenar= oku.nextInt();

        int cevre= kisaKenar+uzunKenar+kisaKenar+uzunKenar;
        int alan= kisaKenar*uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
