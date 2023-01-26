package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yen Şifre oluşturma");

        System.out.print("Yeni şifreniz=");
        String newPassword = oku.nextLine();

        if (newPassword.length() < 8)
        {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Şifre en az 8 karakterden oluşmalı");
            // log tutma: 8 karakterden az denem yaptı
        }

        if (newPassword.length() > 15)
        {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Şifre en fazla 15 karakterden oluşmalı");
            // log tutma
        }

    }
}
