package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        // döngünü kaç kere döneceği belli olmayan durumlarda kullanacağız
        int i=1;
        while (i<=5)
        {
            System.out.println("while_i = " + i);
            i++;
        }
        // inin değeri 5
        System.out.println();
        //for döngüsü, başı belli, sonu belli, artışı belli ise
        for(i=1; i<=5; i++) {
            System.out.println("for_i = " + i);
        }

    }
}
