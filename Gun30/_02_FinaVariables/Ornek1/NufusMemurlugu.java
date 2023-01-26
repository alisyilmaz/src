package Gun30._02_FinaVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("Nazmiye");
        Vatandas v3=new Vatandas("Nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        // v1.tcNo =456;
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken , ya da Constructor da

        final double pi=3.14; // tanımlanırken
        //pi=5; // sonradan değiştirilemez
        //Math.PI;javanın nasıl yaptığına baktım, oda bizim
        // gibi yapmış
    }
}
// final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
                     // yeni artan değer almasını sağlıyor
