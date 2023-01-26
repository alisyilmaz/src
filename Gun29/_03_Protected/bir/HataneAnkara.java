package Gun29._03_Protected.bir;

public class HataneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="ismet";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Anakara Hastanesi";
        //dok1.SicilNo private

        Doctor dok2=new Doctor("Mehmet");
    }
}
