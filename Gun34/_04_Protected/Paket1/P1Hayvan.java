package Gun34._04_Protected.Paket1;

public class P1Hayvan {
    public String ad;  // her paketten , her yerden
    int yas;  // sadece bulunduğu pakettekiler
    protected String cinsi; // default gibi , diğer paketlerden erişimle
                            // ilgili bir seçeneği var
    private String renk; // bulunduğu classdan erişilebilir.
}
