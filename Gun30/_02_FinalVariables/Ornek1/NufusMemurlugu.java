package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("İsnet");
        Vatandas v2=new Vatandas("Nazmiye");
        Vatandas v3=new Vatandas("Nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        // v1.tcNo=456;
        // fınal degıskelere sadece 1 verı atanabılır
        // o da ya tanımlarken yada Constructor da
        // final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
        // yeni artan değer almasını sağlıyor


    }
}
