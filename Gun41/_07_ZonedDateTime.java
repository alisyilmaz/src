package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    // Başka Zaman Bolgelerinin (Time Zone) zaman bilgisini alma
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        // şu anda benim bulunduğum default zamanı verdi.

        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("anbul"))  // istanbul
                System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul = ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime saatLondon = ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);

    }
}
