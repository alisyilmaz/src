package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
      // toLowerCase : stringi küçük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali text = " + text); // Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dünya

        System.out.println("me ile veya ME ile başlıyormu = " +
                text.toLowerCase().startsWith("me")  // true
                );

        System.out.println("text = " + text); // kendisine atama yamzsak kendisi değişmez
        text = text.toLowerCase();
    }
}
