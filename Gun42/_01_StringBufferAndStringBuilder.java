package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";

        cumle = cumle + "Bugün"; // + işareti stringlerde birleştirme yapar
        cumle = cumle + " hava"; // atama ister
        cumle += " çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat() = " + cumle.concat(" fakat dün sıcaktı"));
        System.out.println("cumle = " + cumle);

        cumle= cumle.concat(" fakat dün sıcaktı"); // concat de birleştirir, atama ister
        System.out.println("cumle = " + cumle);

        /***********  StringBuilder  **************/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün ");  // append : ekle , atama gerektirmez, ekler
        cumle2.append(" hava");
        cumle2.append(" soğuk");

        System.out.println("cumle2 = " + cumle2);

        /********** +,concat,StringBuilder  3 model in hızı test edilecek  *****/

        long startTime= System.currentTimeMillis();
        String test1="";
        for(int i=0; i<10000 ; i++)
            test1 = test1+" merhaba";

        System.out.println("+ için süre " + (System.currentTimeMillis()-startTime)+" ms");


        startTime= System.currentTimeMillis();
        String test2="";
        for(int i=0; i<10000 ; i++)
            test2 = test2.concat(" merhaba");

        System.out.println("concat için süre " + (System.currentTimeMillis()-startTime)+" ms");


        startTime= System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for(int i=0; i<10000 ; i++)
            test3 = test3.append(" merhaba");

        System.out.println("StringBuilder için süre " + (System.currentTimeMillis()-startTime)+" ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("***********************\n\n");
        /****** StringBuilder ı biraz yakından tanıyalım    ***/
        StringBuilder sb=new StringBuilder();
        sb.append("Bugün "); // kendine ekleme, atama gerektirmez, (concat de gerekirdi)
        sb.append("hava ");
        sb.append("güzel");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4); // eklenen her şeyi toString hali var ise çevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // Stringi tersine çevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); // (index)0 dahil , 5 hariç olmak üzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index deki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5, "kelime "); // 5 nolu index e kelime yi ekle : araya ekleme
        System.out.println("sb = " + sb);

        sb=new StringBuilder("Bugün hava çok soğuk"); // sıfırlandı ve ilk değer atandı
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu"); // verilen aralığı bu stringle değiştir
        System.out.println("sb = " + sb);

        String strSb=sb.toString();

        StringBuffer sBuffer=new StringBuffer();// tamamen StringBilder ile aynı
        // tekr farkı, paralel çalıan yazılımlarda, StringBuffer kullanılır
    }
}
