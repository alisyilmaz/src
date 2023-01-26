package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // {"trt","atv"}

        String[] tvler={"trt","atv","kanald","fox","habertürk"}; // 01234

        int rastgele= (int)(Math.random()* tvler.length); // 5 kadar 5 dahil değil

        System.out.println("Rasgele secilen Tv = " + tvler[rastgele]);

        // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // TODO : fakat bir buldunu tekrar bulmasın

    }
}
