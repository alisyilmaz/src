package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Saat giriniz=");
        int saat=oku.nextInt();

        if (saat <= 3)
        {
            System.out.println("10 ₺");
        }
        else
        {
            if (saat <= 5)
                System.out.println("15 ₺");
            else
                System.out.println("20 ₺");
        }
    }
}
