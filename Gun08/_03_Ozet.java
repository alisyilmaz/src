package Gun08;

public class _03_Ozet {
    public static void main(String[] args) {
        int sayac=0;   // 0
        int toplam=0;  // 0

//        toplam=toplam+sayac;
//        sayac=sayac+1;

        toplam = toplam + sayac++; // önce işlem sonra artış

        System.out.println("toplam = " + toplam); //0
        System.out.println("sayac = " + sayac);  //1

        sayac++;
        sayac--;


    }
}
