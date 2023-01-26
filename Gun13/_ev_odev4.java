package Gun13;

import java.util.Scanner;

public class _ev_odev4 {
    public static void main(String[] args) {
        // 4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        int sayac = 1;
        int toplam=0;

        while (sayac < 21) // 20 tane sayı gırısı
        {

            System.out.print(sayac+".Sayıyı gırın=");
            int sayi = oku.nextInt();
            if(sayi>10 && sayi<30)





                toplam = toplam + sayi; // girilen sayi ile toplamı tetıkle


            sayac++;
            System.out.println("10 ile 30 arası sayı toplamı = " + toplam);





        }









    }
}
