package Gun36._06_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println(d.cevre(4,5));
        System.out.println(d.alan(4,5));

        Kare k=new Kare();
        System.out.println(k.cevre(5));
        System.out.println(k.alan(5));
    }
}
