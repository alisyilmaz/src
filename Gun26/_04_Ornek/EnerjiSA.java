package Gun26._04_Ornek;

public class EnerjiSA {
    /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.name = "İsmet Temur";
        mus1.elektrikHesabi = new ElektrikHesabi();

        mus1.elektrikHesabi.tuketimEkle(50);
        mus1.elektrikHesabi.tuketimEkle(60);
        mus1.elektrikHesabi.tuketimEkle(70);
        mus1.elektrikHesabi.toplamTuketimYaz();

        mus1.elektrikHesabi.faturaYaz(mus1.name);

    }
}
