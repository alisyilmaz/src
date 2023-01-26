package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayıları 1 bosluk bırakarak giriniz=");
        String sayilar=oku.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex); // "45"
        String strSayi2=sayilar.substring(boslukIndex+1); // "67"

        int sayi1= Integer.parseInt(strSayi1); // 45
        int sayi2= Integer.parseInt(strSayi2); // 67

        if (sayi1 == sayi2)
            System.out.println("Eşit");
        else
            System.out.println("Değil");

    }
}
