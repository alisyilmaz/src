package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        //sayi=5;

        int sayi = 9;
        long toplam = 6700;
        double oran = 3.2;

        oran = sayi; // oran=9 , kayıp yok.
        System.out.println("oran = " + oran);

        toplam = sayi;  // kayıp yok, toplam=9
        System.out.println("toplam = " + toplam);

        oran = toplam;  // kayıp yok,oran=9
        System.out.println("oran = " + oran);
    }
}
