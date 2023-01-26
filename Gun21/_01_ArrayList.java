package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsu, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe arta, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1
        isimler.add("Metin"); // uzunluk 2
        isimler.add("Hacer"); // uzunluk 3
        isimler.add("Aynur"); // uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Muhammed");// verılen ındex e ekliyor,  diğerleri 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer"); // verilen indexdeki elemanı değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Metin"); // var mi
        System.out.println("varMi = " + varMi); // true

        isimler.remove("Metin"); // değere göre siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiğinde index kabul ediyor ve ona göre siliyor
        System.out.println("isimler = " + isimler);

        int indexOfAynur= isimler.indexOf("Aynur");
        System.out.println("indexOfAynur = " + indexOfAynur);

        String ilkEleman=isimler.get(0); // verilen indexdeki değeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // her şeyi temizliyor
        System.out.println("isimler = " + isimler);

    }


}
