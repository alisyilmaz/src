package Gun28._01_Constructor;

public class Okul {

    public static void main(String[] args) {

        //1.Yol
        Ogrenci ogr1=new Ogrenci();// nesne oluşma anı,
        ogr1.id=1;  // özelliklerinin değerlerini veriyorum
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinifi=5;
        System.out.println("ogr1.ad = " + ogr1.ad);

        //2.Yol
        Ogrenci ogr2=new Ogrenci(2,"mehmet","yılmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3.Yol
        Ogrenci ogr3=new Ogrenci(2,"Ayşe","Bayrak");

    }

}
