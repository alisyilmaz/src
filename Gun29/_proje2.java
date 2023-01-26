package Gun29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _proje2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secim;
        String username, password;
        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));

        System.out.print("Lütfen kullanıcı adınızı girin: ");
        username = sc.nextLine();
        System.out.print("Lütfen şifrenizi girin: ");
        password = sc.nextLine();

        if (!users.contains(username) || !passwords.contains(password)) {
            System.out.println("Geçersiz kullanıcı adı veya şifre.");
        } else {
            System.out.println("Banka işlemleri: ");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(i + 1 + ". " + actions.get(i));
            }

            System.out.print("Lütfen bir işlem seçin: ");
            secim = sc.nextInt();


            switch (actions.get(secim - 1)) {

                case "Para_Yatir":

                    System.out.println("Para yatırma işlemi seçildi.");
                    System.out.print("Lütfen yatırmak istediğiniz tutarı girin: ");
                    double amount = sc.nextDouble();
                    System.out.print("Lütfen hesap numarasını girin: ");
                    String accountNumber = sc.nextLine();

                    List<String> accountNumbers = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
                    double newBalance =0;
                    double getBalance=0;
                    double updateBalance=0;


                    if (!accountNumbers.contains(accountNumber)) {
                        System.out.println("Geçersiz hesap numarası.");

                    } else {

                    }

                    break;

                case "Para_Cek":
                    System.out.println("Para çekme işlemi seçildi.");
                    break;
                case "Transfer":
                    System.out.println("Transfer işlemi seçildi.");
                    break;
                case "Cikis":
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;

            }
        }
    }
}
