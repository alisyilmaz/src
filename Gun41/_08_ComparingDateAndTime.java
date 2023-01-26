package Gun41;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun= LocalDate.now();
        LocalDate dun= buGun.minusDays(1);

        boolean sonraMi=buGun.isAfter(dun); // bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=buGun.isBefore(dun); // bugün dünden önce mi
        System.out.println("onceMi = " + onceMi);
        
        boolean esitMi= buGun.isEqual(dun); // bugün dün e eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi= buGun.isLeapYear(); // bugün artık yıl mı
        System.out.println("artikYilMi = " + artikYilMi);
    }
}
