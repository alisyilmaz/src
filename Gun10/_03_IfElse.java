package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi=oku.nextInt();

        int kalan = sayi % 2;  // 0 ,  1 veya -1

        if (kalan == 0)
            System.out.println("Çift");  // 0 durumunda yapıalcaklar
        else                       //!=0  yani yukarıdaki değilse -1,1
            System.out.println("tek");

    }
}
