package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz(); // cember çizildi

        Dikdortgen d=new Dikdortgen();
        d.ciz(); // dikdörtgen çizildi

        //interface lerden nesne üretileme fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // çember çizildi
        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişeniirsin

        cizdirme(c);
        cizdirme(d);
    }

    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }


}
