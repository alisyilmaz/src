package Gun04;

public class _04_WideningCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 5;


        sayi = (int) oran; // büyük bir alanı kucuk alana atıyorsun
        // tehlikeli işlem yapıyorsun bundan dolayı challenger patladı
        // degerlere bak eger olusan verı kaybını anladıysan ve kabulse
        // bana bunu bılerek goster.

        System.out.println("sayi = " + sayi);
        //******************************************
        byte kisaKenar = 5;
        byte uzunKenar = 7;


        byte cevre = (byte) (kisaKenar + uzunKenar + kisaKenar + uzunKenar);

        // sen eşitiliğin 2. tarafı rakamlar toplndı benım toplam burada INT  durumunda
        // byte cevre= 5+7+5+7 ; // int i byte catmaya calısıyorsun.
        // eger verı kaybını olmayacagından emınsen veya verı kabı onemlı degılse 
        // bana bunu belirt // byte cevre = (byte)<< belirttik
        System.out.println("cevre = " + cevre);
        int cevre2 = kisaKenar + uzunKenar + kisaKenar + uzunKenar; // alternatif
        System.out.println("cevre2 = " + cevre2);


    }
}
