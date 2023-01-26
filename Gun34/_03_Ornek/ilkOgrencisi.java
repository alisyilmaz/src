package Gun34._03_Ornek;

public class ilkOgrencisi extends Ogrenci {
    private String klup;

    private static int ilkIdSayac=1;
    public ilkOgrencisi(String isim, OgrTip tipi, String klup) {
        super(isim, tipi, ilkIdSayac++);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return "ilkOgrencisi{" +
                "klup='" + klup + '\'' +
                "} " + super.toString();
    }
}
