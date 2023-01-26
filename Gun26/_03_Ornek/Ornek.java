package Gun26._03_Ornek;

public class Ornek {
    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
    //         (properties, fields, özellik, eleman, items,attribute) : width(int), length(int)
    // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
    // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=5;
        r.width=4;

        r.getAlan();
        r.getCevre();

    }
}
