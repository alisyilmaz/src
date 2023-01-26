package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS
        // HashSet : Hızlı, bunun için kendine göre algoritmik sırada tutar
        // LinkedHashSet : EKLEME SIRASI na göre sıralı tutar.
        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu

        // Hızlı, bunun için kendine göre algoritmik sırada tutar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        // EKLEME SIRASI na göre sıralı tutar.
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //herzaman içinde SIRALI şekilde tutar, kendinden sortlu
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);


    }
}
