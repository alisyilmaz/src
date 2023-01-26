package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo =1;
        ogr.tamAd="İsmet Temur";

        // 1.yöntem
        ogr.okulu = new Okul();
        ogr.okulu.adi="Mehmet Akif Erson okulu";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti=50000;

        //2.yöntem
        Okul ok=new Okul();
        ok.adi="Mehmet Akif Erson okulu";
        ok.mudurAdi ="Merve Aslan";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("okul ad = " + ogr.okulu.adi);
        System.out.println("mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ucreti = " + ogr.okulu.ucreti);

    }
}
