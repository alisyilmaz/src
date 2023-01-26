package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // 01234  : harflerin oda numaraları 0 dan başlar: index.
        // Bugün

        //              0123456789
        String cumle = "Merhaba Dünya";
        // D nin index i kaçtır
        // M nin index i kaçtır
        // 0(506)3445567 -> ( in oda numarası kaç tır
        // Verilen karakter(ler)in string içindeki INDEX ini verir

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok

        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",5)  ); //6
                        // a yı aramaya 5(dahil) nolu index ten sonra başla

    }
}
