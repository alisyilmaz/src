package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("a değeri =");
        int a= oku.nextInt();

        System.out.print("b değeri =");
        int b= oku.nextInt();

        System.out.print("c değeri =");
        int c= oku.nextInt();

        //1.Yöntem
        int enb=Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb = " + enb);

        //2.yöntem
        int enb2= Math.max(a, Math.max(b,c)  );
        System.out.println("enb2 = " + enb2);

    }
}
