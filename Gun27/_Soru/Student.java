package Gun27._Soru;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle (Lesson ders)
    {
        int suAnToplamSaat=0;
        for(Lesson d: dersleri)
            suAnToplamSaat+=d.saat;


        if (suAnToplamSaat +ders.saat<= maxSaat)
        dersleri.add(ders);

        else
            System.out.println(ders.name+" Kredi sınırı asıldı");


    }

    public void dersleriYazdir()
    {
        System.out.println("********Transkripy*****");
        System.out.println("sayın"+name);
        System.out.println("Aldıgınız dersler");
        for (Lesson d : dersleri)
            System.out.println(d.name+ " "+d.saat);

    }

}
