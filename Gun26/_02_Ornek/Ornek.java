package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class Ornek {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.


    public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Hatice";
        cal1.surName ="Demir";
        cal1.age=30;

        Person cal2=new Person();
        cal2.name="Muhammed";
        cal2.surName ="Gürdal";
        cal2.age=35;

        //1.Yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surName = " + cal1.surName);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surName = " + cal2.surName);
        System.out.println("cal2.age = " + cal2.age);

        //2.Yöntem normal metod
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        //3.Yöntem metodu ait olduğu class dan çağırıyoruz
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

//        int[] dizi=new int[5];
//        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
//
//        ArrayList<Integer> liste=new ArrayList<>();
//        System.out.println("liste = " + liste.toString());

        //4.Yöntem
        System.out.println("cal1 = " + cal1);
        cal1.getBirthYear();
        System.out.println(cal2.getBirthYear2());
        cal1.getInitials();
    }

    public static void BilgiYazdir(Person cal)
    {
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surName = " + cal.surName);
        System.out.println("cal.age = " + cal.age);
    }


}
