package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        if (sayi % 2  == 0)
            System.out.println("çift");
        else
            System.out.println("tek");


        String sonuc= (sayi % 2  == 0) ? "çift" : "tek";// ? -> if    : -> else
        System.out.println("sonuc = " + sonuc);


        System.out.println( ((sayi % 2  == 0) ? "çift" : "tek")  );

    }
}
