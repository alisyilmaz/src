package Gun27._02_Ornek;

public class Soru {
    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {
        int max = MyMath.getMax(4, 6);
        int min = MyMath.getMin(4, 6);
        int rnd = MyMath.getRandom(10);
        double usSonuc=MyMath.getUsAl(2,3);
        double kareKok=MyMath.getKareKok(16);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("kareKok = " + kareKok);

    }
}
