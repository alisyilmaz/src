package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 5;

        sayi = (int) oran; // büyük bir alanı, küçük alana atıyorsun
        // tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
        // değerlere bak , eğer oluşan veri kaybınıanladıysan ve kabulunse
        // bana bunu bilerek yaptığını göster.

        System.out.println("sayi = " + sayi);
        /**********************************************/
        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre= (byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        //sen eşitliğin 2.tarafı rakamlar toplandı, benim toplam burada INT durumunda
        // byte cevre = 5+7+5+7;   // int i -> byte atmaya çalışıyorsun.
        // eğer veri kaybı olmayacağından eminsen, veya veri kaybı önemli değilse
        // bana bunu yazarak göster.
        System.out.println("cevre = " + cevre);

        int cevre2= kisaKenar+uzunKenar+kisaKenar+uzunKenar; //alternatif
        System.out.println("cevre2 = " + cevre2);
    }
}
