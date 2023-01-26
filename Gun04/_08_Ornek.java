package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.

        String bagis1="500";
        String bagis2="1500";

        System.out.println(bagis1+bagis2); // 5001500 yazar

        int sayiBagis1= Integer.parseInt(bagis1);
        int sayiBagis2= Integer.parseInt(bagis2);

        int toplamBagis=sayiBagis1+sayiBagis2;
        System.out.println("toplamBagis = " + toplamBagis);

    }
}
