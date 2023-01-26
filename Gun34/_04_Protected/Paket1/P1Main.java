package Gun34._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="karakedi"; // public erişildi
        p1h.yas=2; // default erişildi
        p1h.cinsi ="tekir"; //protected erisildi
        // p1h.renk private, sadece kendi classından
    }
}
