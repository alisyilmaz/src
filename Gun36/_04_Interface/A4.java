package Gun36._04_Interface;

//1 class 1 den fazla Interface implemente edebilir
public class A4 implements IGosterir,IYazdirir{
    //hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");
    }
}
