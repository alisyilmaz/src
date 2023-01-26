package Gun44;

public class _01_JavaException {
    public static void main(String[] args) {

        System.out.println("program calısıyor");
        String kelime=""; // once koymadık compıle error
        char harf =kelime.charAt(3); // bu satırı en son ekledık bu RUNTIME error
        System.out.println("program bıttı");
        // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
        // Derleme zamanı yani COMPILE ERROR, Exception diyoruz.
        //program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        //çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.





    }
}
