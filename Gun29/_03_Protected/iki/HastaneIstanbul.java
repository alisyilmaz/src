package Gun29._03_Protected.iki;

import Gun29._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dok1=new Doctor("mehmet");
        dok1.hastaneAd="İstanbul Hastane";

        //Doctor dok2=new Doctor();
        // default sadece
        // kendi paketi ulasır.
    }
}
