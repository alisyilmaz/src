package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, String cinsi) {
        this.ad=ad;
        this.cinsi=cinsi; // defaulttan farklı olarak
        // extend edildiğinde diğer paketlerden de erişilebilir.
    }
}
