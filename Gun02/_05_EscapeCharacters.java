package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
       // Escape Characters
       //  \n -> yeni satır açıyor, alt satıra geçiyor
       //  \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
       //  \b -> back-space bir karakter geri siler
       //  \" -> " tırnak yazmak için kullanılıyor
       //  \\ -> \ yazılacak ekrana
       //  \r -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar

        System.out.println("MerhabaDünya"); //  MerhabaDünya
        System.out.println("Merhaba\nDünya");  // Merhaba alt satıra geçer Dünya
        // print veya println  \ görünce bu ekrana yazılacak bir karakter değil,
        // ayrı bir iş yapmam isteniyor, devam eden n karakterini görünce
        // ayrı işin alt satıra geçmek olduğunu anlıyor
        System.out.println("Merhaba\tDünya");  // Merhaba   Dünya
        System.out.println("Merhaba\bDünya");  // MerhabDünya
        System.out.println("Merhaba\"Dünya");  // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");  // Merhaba\Dünya
        System.out.println("Merhaba\rDünya");  // Dünya
    }
}
