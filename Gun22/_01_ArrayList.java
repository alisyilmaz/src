package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Sıralam işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Max ve Min eleman bulma
        System.out.println("max() = " + Collections.max(sayilar));
        System.out.println("min() = " + Collections.min(sayilar));

        // Bütün elemanları set etme
        Collections.fill(sayilar,0); // bütün elemanlara 0 atar
        System.out.println("sayilar = " + sayilar);

        //replace
        Collections.replaceAll(sayilar,0,5);// 0 lara 5 atadı
        System.out.println("sayilar = " + sayilar);

        // tanımlarken değer atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer> liste=new ArrayList<>( Arrays.asList(3,4,5,6) );
        System.out.println("liste = " + liste);
        ArrayList<String> strliste=new ArrayList<>( Arrays.asList("ahmet","mehmet","büşra","roman") );
        System.out.println("strliste = " + strliste);

        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2, 2,3,4,5,6,67);

        //diziyi direk ArrayList e nasıl atarım.
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> list3= new ArrayList<>( Arrays.asList(dizi2) );
        System.out.println("list3 = " + list3);

    }
}
