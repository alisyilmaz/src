package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz="); // STUDY
        String cumle=oku.nextLine();

       // boolean varMi=cumle.toLowerCase().contains("study");

        if (cumle.length() > 10 && cumle.toLowerCase().contains("study"))
        {
            System.out.println("EVET");
        }
        else {
            System.out.println("HAYIR");
        }
    }
}
