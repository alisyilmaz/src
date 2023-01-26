package Gun13;

import java.util.Scanner;

public class _ev_odev2 {
    public static void main(String[] args) {
        //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
        Scanner oku = new Scanner(System.in);


        int i = 0;
        int toplam=0;
        int tekSayı=0;

        while (i < 20)
        {

            System.out.print(i+".Sayıyı gırın=");
            int sayi = oku.nextInt();
            if(sayi %2!=0)

                tekSayı++;


            i++;

        }
        System.out.println("girilen teksayı="+tekSayı);



    }
}
