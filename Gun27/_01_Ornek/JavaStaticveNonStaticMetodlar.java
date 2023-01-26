package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        int sayi=345;
        String strSayi=String.valueOf(sayi);
        int intSayi   =Integer.parseInt(strSayi);

        Utility ut=new Utility();
        String strSayi2= ut.getString(sayi);

        // Static metodlar zaten var olduklaır için
        // new ile yeni oluşturulmaya ihtiyaç duymazlar
        String strSayi3= Utility.getString2(sayi);

    }
}
