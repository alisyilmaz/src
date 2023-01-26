package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz
        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;

        do{ // döngü arası şart başta olmadığından
            // en az 1 kez çalışır, kontrol sonda
            System.out.print("sayı giriniz=");
            sayi=oku.nextInt();

            toplam=toplam+sayi;
        }while (sayi!=0);

        System.out.println("toplam = " + toplam);


    }
}
