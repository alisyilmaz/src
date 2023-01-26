package Gun27._01_Ornek;

public class Utility {

    public String getString(int sayi) // nesneye ait,
    {
        return String.valueOf(sayi);
    }

    public static String getString2(int sayi) // static metodlar class a ait,
    {
        return String.valueOf(sayi);
    }

    // STATIC olan metdolar SINIF a yani CLASS yani
    // TİP e ait
    // STATIC olmayanlar kime ait nesneye ait bu sepele
    // mutlaka oluşturulmaları gerekiyor

    // Nesneyi ilgilendiren metdoları normal yazıyoruz.
    // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
    // metodları STATIC ile yazıyoruz.
}
