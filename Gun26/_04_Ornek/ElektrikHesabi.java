package Gun26._04_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int aylikTuketim)
    {
        toplamTuketim=toplamTuketim+aylikTuketim;
    }

    public void toplamTuketimYaz()
    {
        System.out.println("toplamTuketim = " + toplamTuketim);
    }

    public void faturaYaz(String isim)
    {
        fatura=toplamTuketim*birimFiyat;
        System.out.println("**********************");
        System.out.println("     Faturanız");
        System.out.println("**********************");
        System.out.println("Müşteri = "+ isim);
        System.out.println("Toplam Tüketim = "+ toplamTuketim);
        System.out.println("Toplam Tutar = "+ Math.round(fatura));
        System.out.println("**********************");
    }
}
