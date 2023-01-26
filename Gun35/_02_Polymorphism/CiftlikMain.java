package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
//        kopek1.ses(); // havladı
//        kopek1.kokladi(); // kokladı

        Kedi kedi1=new Kedi("kopuk");
//        kedi1.ses(); //miyavladı
//        kedi1.tirmaladi(); // tırmaladı
//
//        kopekSesi(kopek1); // havladı
//        kediSesi(kedi1); // miyavladı

        hayvanSesi(kopek1); // havladı
        hayvanSesi(kedi1);  // miyavladı

        /************************************/
        // Referans tipi   // nesne tipi
        Hayvan hayvan1=new Hayvan("ördek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal"); // hayvanlardan 1 köpek
        Hayvan hayvan3=new Kedi("boncuk");  // hayvanlardan 1 kedi

        System.out.println(" -------------------- ");
        hayvan1.ses(); // genel hayvan ses çıkardı
        hayvan2.ses(); // köpek hayvan , havladı
        hayvan3.ses(); // kedi hayvanı, miyavladı
        System.out.println(" -------------------- ");

        hayvan2.ses();  // kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yara mı
        ((Kopek)hayvan2).kokladi(); // artık diğer metodları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.



    }

    public static void kopekSesi(Kopek kopek)
    {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi)
    {
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan)
    {
        // buraya hem kedi geliyor hem kopek geliyor
        hayvan.ses();

        //bir classın aslında  kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında Kopek mi
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi) // hayvan aslında Kedi mi
            ((Kedi)hayvan).tirmaladi();
    }
}

//  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız.