package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız  kg / (boy*boy)

        double agirlik=75.0;
        int boy=165;

        double kitleIndex= agirlik / (boy*boy) ;

        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("boyunuz="+boy+", kilonuz="+agirlik);

        /****************************/
        double boy2=1.65;
        double kitleIndex2= agirlik / (boy2*boy2) ;
        System.out.println("kitleIndex2 = " + kitleIndex2);
    }
}
