package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains :  bir stringin içerisinde karakter(lerin) var olup
        // olmadıgını boolean cinsinden söyle true veya false

        String cumle="Merhaba Dünya";

        boolean varMi= cumle.contains("a");
        System.out.println("varMi = " + varMi);

        //direkt de yapabilirsiniz
        System.out.println("varMi = " + cumle.contains("a"));

        System.out.println("ya VarMi = " + cumle.contains("ya"));
        System.out.println("k VarMi = " + cumle.contains("k"));
    }
}
