package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 012345678
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Aralarında 1 boşluk bırakarak 3 sayı giriniz=");
        String sayilar=oku.nextLine();

        int bos1Ind=sayilar.indexOf(" "); // 2
        int bos2Ind=sayilar.lastIndexOf(" "); // 5
         //int bos2Ind2 = sayilar.indexOf(" ", bos1Ind+1); //2.boşluğu aramaya verilen yerden sonra başla

        int sayi1= Integer.parseInt(  sayilar.substring(0,bos1Ind) ); // 45
        int sayi2= Integer.parseInt(  sayilar.substring(bos1Ind+1, bos2Ind) ); // 67
        int sayi3= Integer.parseInt(  sayilar.substring(bos2Ind+1) ); // 123

        if (  (sayi1+sayi2+sayi3) % 2 == 0  )
        {
            System.out.println("Çift");
        }
        else
        {
            System.out.println("Tek");
        }



    }
}
