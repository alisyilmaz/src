package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        //  İki kenarı tanımlı olarak verilen bir
        //  dikdortgenin çevresini ve alanını bulunuz
        //  çarpma :   * kullanılıyor ,   x ise harf olarak kullanılıyor
        //  bir kenarı a ise , diğer kenarı b ise, cevre=a+a+b+b, alan =a*b

        int kisaKenar = 5;
        int uzunKenar = 8;

        int cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar; // 2*kisaKenar + 2*uzunKenar , (kisaKenar+uzunKenar)*2
        int alan;

        alan = kisaKenar * uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
