package Gun27._Soru;

import org.w3c.dom.ls.LSException;

public class _03_Ornek {
    public static void main(String[] args) {


        Lesson ders1 =new Lesson();
        ders1.name="Algoritma";
        ders1.saat=4;

        Lesson ders2 =new Lesson();
        ders2.name="java";
        ders2.saat=4;

        Lesson ders3 =new Lesson();
        ders3.name="Test Tools";
        ders3.saat=3;

        Student ogr1=new Student();
        ogr1.name="ismet";
        ogr1.maxSaat=10;

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);




    }
}
