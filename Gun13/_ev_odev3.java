package Gun13;

import java.util.Scanner;

public class _ev_odev3 {
    public static void main(String[] args) {
        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.
        Scanner util=new Scanner(System.in);
        int i=0,toplam=0,sayi;
        System.out.print("sayı girin= ");
        sayi=util.nextInt();


        while(i<=sayi)
        {

            toplam=toplam+i;
            i++;

        }

        System.out.println("SAYIYA KADAR OLAN TOPLAM:"+toplam);







    }
}
