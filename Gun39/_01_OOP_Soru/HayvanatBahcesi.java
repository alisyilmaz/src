package Gun39._01_OOP_Soru;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kd=new Kedi("köpük",false,"01/01/2015");
        //System.out.println("kd = " + kd);
        kd.guzelYaz();

        Kartal kr=new Kartal("Kara Kartal", true, "01/05/2017");
        //System.out.println("kr = " + kr);
        kr.guzelYaz();
    }
}
