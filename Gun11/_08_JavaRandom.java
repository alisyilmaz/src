package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Math.Random() : double sayı üretir. 0 - 0,999999999 arası üretiyor.

        double randSayi= Math.random();
        System.out.println("randSayi = " + randSayi);

        // 0-6 arası üretsin
        // 6 ile çarparım
        // 0 - 5,999999999
        // int çevirirsem 0-5;

        int rndTamSayi = (int) (Math.random() * 6);
        System.out.println("rndTamSayi = " + rndTamSayi);
    }
}
