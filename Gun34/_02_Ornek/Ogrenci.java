package Gun34._02_Ornek;

public class Ogrenci {
    private final int id;
    private String isim;
    private OgrTip tipi;

    private static int idSayac=1;

    public Ogrenci(String isim, OgrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        this.id=idSayac++;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if (isim.length() < 25)
         this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}

