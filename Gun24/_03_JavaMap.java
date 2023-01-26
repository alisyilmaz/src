package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız

        HashMap<String,String> uKartVizit=new HashMap<>();
        uKartVizit.put("isim", "Ugur Yılmaz");
        uKartVizit.put("email","ugur@gmail.com");
        uKartVizit.put("adres", "Çekmeköy/İstanbul");
        uKartVizit.put("telefon","050566677778");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(tel) = "  + uKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit=new HashMap<>();
        aKartVizit.put("isim", "Ayşe Bayrak");
        aKartVizit.put("email","ayse@gmail.com");
        aKartVizit.put("adres", "Şişli/İstanbul");
        aKartVizit.put("telefon","053244455667");


        HashMap<String,  HashMap<String,String>  > kartvizitler=new HashMap<>();

        kartvizitler.put("ugur", uKartVizit);
        kartvizitler.put("ayse", aKartVizit);

        System.out.println("ugur un kartviziti = " + kartvizitler.get("ugur"));
        System.out.println("aysenin kartviziti = " + kartvizitler.get("ayse"));

        //ayse nin adresi
        System.out.println("Ayşenin adresi = " + kartvizitler.get("ayse").get("adres"));

        // sadece emailler
        for(Map.Entry<String,  HashMap<String,String>>  kv: kartvizitler.entrySet())
        {
            System.out.println("emailler = " + kv.getValue().get("email"));
        }


    }
}
