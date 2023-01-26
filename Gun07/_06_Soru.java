package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve soyadınız=");
        String adSoyad=oku.nextLine();

        //ismet temur, Ali Koç
        // ad: 0, boslugun indexine kadar
        // soyad: bosluk+1, sonuna kadar

        int boslukIndex=adSoyad.indexOf(" ");
        String ad= adSoyad.substring(0, boslukIndex);
        String soyad = adSoyad.substring(boslukIndex+1);  // 2 indexi vermezsen sonuna kadar alır

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
