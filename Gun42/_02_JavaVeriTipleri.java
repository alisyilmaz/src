package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel tipler , primitve tipler : short,byte,long,float,double,boolean
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2; // sayi1=10 // eşitlesen değerler atanı kendi hücreleri
        sayi1=34;               // yine ayrı ayrı kalır
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


        // Referans Tipler: classlar,diziler,arraylar, nesneler
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //5,6

        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); // 67,6

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 55,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); // 55,6

        // Nesne Tipler : NULL alabilen ilkel tip
        // String, Innteger, Double, Long
        String ad1="mehmet";
        String ad2="ismet";
        // Referans ama davranışı ilkel

        ad2=ad1;
        System.out.println("ad1 = " + ad1); // ismet
        System.out.println("ad2 = " + ad2); // ismet

        ad1="Ali";
        System.out.println("ad1 = " + ad1);  // ali
        System.out.println("ad2 = " + ad2);  // ismet

    }
}
