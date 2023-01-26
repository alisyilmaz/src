package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
        // replace : bir string içindeki karakter(leri) verilenle değiştirir.hepsini

        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a","e")); // Merhebe Dünye
        System.out.println("text.replace(ba,de) = " + text.replace("ba","de")); // Merhade Dünya
        System.out.println("text.replace(Dünya,Java) = " + text.replace("Dünya","Java")); // Merhaba Java
        System.out.println("text.replace(a,'') = " + text.replace("a","")); // a lar silindi
    }
}
