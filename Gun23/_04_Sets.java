package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(4);

        System.out.println("hs.size() = " + hs.size());

        hs.remove(5); // elemanın kendi değerine siliyor.
        System.out.println("remove sonrası hs = " + hs);

        if (hs.contains(7))
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear();
        System.out.println("hs = " + hs);
    }
}
