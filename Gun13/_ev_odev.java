package Gun13;

import java.util.Scanner;

public class _ev_odev {
    public static void main(String[] args) {

        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

         Scanner oku = new Scanner(System.in);


        int i = 1;
        int toplam=0;

        while (i < 20)
        {

            System.out.print(i+".Sayıyı gırın=");
            int sayi = oku.nextInt();
            if(sayi %2!=0)

                toplam = toplam + sayi;

            i++;

        }
        System.out.println("Tek sayı toplamı="+toplam);
















    }
}
