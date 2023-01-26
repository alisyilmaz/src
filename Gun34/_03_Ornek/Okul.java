package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("İsme Temur", OgrTip.LISE,"SAY");
        LiseOgrencisi lo2=new LiseOgrencisi("Mehmet Yılmaz", OgrTip.LISE,"SÖZ");
        ilkOgrencisi io=new ilkOgrencisi("Ayşe Bayrak", OgrTip.ILK,"Satranç");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);
    }
}
