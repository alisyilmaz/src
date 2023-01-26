package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {

    String isim;
    final int tcNo;
    // final deger atandıktan sonra degıstırmeyı engellıyor

    static int tcNoSayac=1;
    // statcık sayac ıse her yenı nessne olustugunda
    // yenı aratan deger almasını saglıyor

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
        // fınal degıskelere sadece 1 verı atanabılır
        // o da ya tanımlarken yada Constructor da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
