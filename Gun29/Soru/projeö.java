package Gun29.Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class projeö {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner Cscan2 = new Scanner(System.in);

        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> accounts = new ArrayList<>(Arrays.asList("1234", "5678", "999"));
        List<Integer> amounts = new ArrayList<>(Arrays.asList(200, 1000, 5000)); // hesaptakı para
        String chosenAccount = "";
        boolean devam = true;


        while (true) {

            System.out.print("Kullanıcı adınızı giriniz=");
            String username = scan.next();
            System.out.print("Şifrenizi giriniz=");
            String password = scan.next();

            if (confirmUsernameAndPassword(users, passwords, username, password)) {
                System.out.println("Başarılı bir şekilde giriş yaptınız"); break;
            }
            System.out.println("Kullanıcı adı ve Şifreyi Kontrol Edin !!!");
        }


        while (true) {


            System.out.print("Yapmak istediginiz islemi secin");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1: {
                    System.out.println("\"Para Çekme Sisteminde Arıza Vardır...\"");
                    break;
                }
                case 2: {
                    System.out.println("\"Hangi hesaptan para cekmek istiyorsunuz ?\"");
                    for (int i = 0; i < accounts.size(); i++) {
                        System.out.println(accounts.get(i));

                    }
                    String yenioku = Cscan2.nextLine();
                    System.out.println("Çekmek istediğiniz Tutarı Giriniz");
                    int yenioku2 = scan.nextInt();
                    System.out.println("=");
                    withdraw(accounts, amounts, yenioku, yenioku2 )

                    ; break;

                }
                case 3: {
                    System.out.println("\"Bu islemi su an gerceklestiremiyoruz\""); break;

                }
                case 4:
                    System.exit(1);
                    System.out.print("=");

                default: {
                    System.out.println("Yanlış Seçim Yaptınız");
                }


            }
       /*
        }
       */
        }



    }



    private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {


        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equalsIgnoreCase(username) && (passwords.get(i).equalsIgnoreCase(password))) {
                return true;
            }
        }
        return false;
    }


    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {
        int index = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equalsIgnoreCase(chosenAccount)) {

                index = i;

            }
        }

        if (index > -1 && funds.get(index) > amountToWithdraw) {

            funds.set(index, funds.get(index) - amountToWithdraw);
            System.out.println("Lütfen paranızı alınız. Hesabınızda " + funds.get(index) + " ₺ kalmıştır");
        }   else
            System.out.println("Beklenmedik bir hata olustu...Iyi gunler dileriz...");
    }
}
