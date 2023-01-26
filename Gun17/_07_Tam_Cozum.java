package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Tam_Cozum {
    public static void main(String[] args) {

        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*11);
        }

        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)= ");
        int arananRakam=oku.nextInt();

        boolean bulundu=false;
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] == arananRakam) {
                bulundu=true;
                System.out.println("Bulundu index="+i);
            }

        }

        if (!bulundu)
        {
            System.out.println("Bulunamadı");
        }



    }
}
