package Gun34._02_Ornek;

public class ilkOgrencisi extends Ogrenci{
    private String klup;

    public ilkOgrencisi(String isim, OgrTip tipi, String klup) {
        super(isim, tipi);
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
