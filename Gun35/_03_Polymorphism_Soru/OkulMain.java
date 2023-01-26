package Gun35._03_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("Ayşe","Yılmaz","Öğrenci","5A");
        Calisan cal=new Calisan("Ali","Yılmaz","Yazilim","BIM");

//        System.out.println("cal = " + cal);
//        System.out.println("ogr = " + ogr); her bir class kendi
//        toString ini kullanıyor bu yüzden tek metod değil

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);
    }
}
