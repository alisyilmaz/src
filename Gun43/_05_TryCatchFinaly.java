package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try{
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
            // hata olma olasılığının olduğu kodlar
        }
        catch (Exception ex)
        {
            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        }
        finally // hata olsada çalışır , olmasada çalışacak kısım, bu bölümn yukarıdaki süreçle
                // olduğunu göstermek için finally içinde yazılır
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
        }

        System.out.println("diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
