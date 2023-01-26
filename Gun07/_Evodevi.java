package Gun07;

import java.util.Scanner;

public class _Evodevi {

    public static void main(String[] args) {
        // Soru 1 **I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        String cumle = "**I love Java**";
        int uzunluk = cumle.length();

        System.out.println("uzunluk =" + uzunluk);

        // Soru 3: **Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.

        String cumle1 = "**Sprint Planning**";
        int uzunluk2 = cumle1.length();
        System.out.println("uzunluk2 = " + uzunluk2);

        // Soru 3:**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.

        String cumle3 = "apple";
        boolean varmi = cumle3.equals("app");
        System.out.println("varmi = " + cumle3.contains("app"));

        // Soru 4: **orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String orange = "orange";
        boolean esitMi = orange.equals("Apple");
        System.out.println("Eşit mi = " + orange.contains("Apple"));

        // Soru 5:**apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir._

        String s1 = "apple";
        String s2 = "APPLE";

        System.out.println("Eşit Mi? = " + s2.equalsIgnoreCase(s2));

        // Soru 6: /6-Florida** kelimesinden bir String oluşturun.
        ////Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        String Florida = "Florida";
        System.out.println("O harfinin İndexi = " + Florida.indexOf("o"));

        //********************************************************************************


        //Soru 7: **Thank you** olan bir String oluşturun.

        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.


        String cumle2 = "Thank you";
        System.out.println("y'nin konumu=" + (cumle2.indexOf("y") + 1));

        //******************************************************************

        //Soru 8: **Main method** oluşturun.

        // **Mouse** değerinde bir String oluştur.

        // Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.


        //public static void main(String[] args)

        String mouse = "Mouse";

        System.out.println("mouse = " + mouse);
        System.out.println("U Harfini _ ile degıstirdik = " + mouse.replace("u", "_"));

        //**************************************************************************
        //Soru 9: - **paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.


        String paperKelime = "paper";

        System.out.println("Küçük Hali = " + paperKelime);
        System.out.println("Büyük Hali = " + paperKelime.toUpperCase());

        //**************************************************************************

        // Soru 10: **OraNge** olan bir String oluşturun.

        // String'i _küçük harfe_ çevirin ve yazdırın.   //örn: APPLE > apple

        String Orange = "OraNge";
        System.out.println("Orange = " + Orange);
        System.out.println("Küçük harfler ile yazdırdık = " + Orange.toLowerCase());


        //**************************************************************************

        //Soru 11: - **New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın

        String NewJ = "New Jersey";
        System.out.println("Orjinal Hali= " + NewJ);
        System.out.println("Büyük Hali = " + NewJ.toUpperCase());


        //**************************************************************************

        //Soru 12:  - **New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.

        String Newy = "New York";
        System.out.println("Orjinali = " + Newy);
        System.out.println("Küçük Harflerle= " + Newy.toLowerCase());


        //**************************************************************************
        //Soru 13:  - **PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.

        String Paddle = "PADDLE";
        System.out.println("Paddle = " + Paddle);
        System.out.println("Küçük hali = " + Paddle.toLowerCase());

        //-------------------------Özel Sorular------------------------
        // 1 -  Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ad Girin=");
        String ad = oku.nextLine();
        System.out.print("Soyad Girin");
        String soyad = oku.nextLine();
        System.out.println("Adım Soyadım :" + ad + " " + soyad);


        // 2 -  Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        System.out.print("Cümle giriniz");
        String cumler = oku.nextLine();
        System.out.println("Boş mu?  = " + cumler.isEmpty());

        // 3 - girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

        //yapamadım

        // 4 -  girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner yenicumle1= new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz : ");
        String yenicumle = yenicumle1.nextLine();

        int lenght = yenicumle.length();

        String Asızyenicumle = yenicumle.replaceAll("[Aa]", "");

        int Asızuzunluk=Asızyenicumle.length();

        int aninNumarasi=(lenght-Asızuzunluk);
        System.out.println("Cümledeki a - A Harfleri : " + aninNumarasi);


        //--------------------------------------------------

        System.out.print("Kelime Girin=");
        String kelimegir = oku.nextLine();
        int sonHarfIndexi = kelimegir.length()-1;

        char sonHarfChar = kelimegir.charAt(sonHarfIndexi);
        char ilkHarf=kelimegir.charAt(0);
        String sonHarfStr = kelimegir.substring(sonHarfIndexi);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("sonHarf = " + sonHarfStr);

        




    }

    }