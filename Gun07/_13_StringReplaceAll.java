package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak
        String text="Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali
        System.out.println("abn -> _  = " + text.replaceAll("[abn]","_"));
        // a veya b veya n leri _ yap    ->  Merh___ Dü_y_123

        System.out.println("A-Z -> _  = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar büyük harfleri _ yap  ->  _erhaba _ünya123

        System.out.println("0-9 -> _  = " + text.replaceAll("[0-9]",""));
        // rakamları sil  Merhaba Dünya

        System.out.println("0-9 dışındakile -> _  = " + text.replaceAll("[^0-9]",""));
        // rakamları dışındakileri sil  123

    }
}
