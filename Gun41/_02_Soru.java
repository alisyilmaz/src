package Gun41;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    // Canlı digital saat yapınız

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");

        while(true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.Bekle(1);
        }

    }



}
