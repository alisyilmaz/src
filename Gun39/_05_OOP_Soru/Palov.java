package Gun39._05_OOP_Soru;

public class Palov implements IFood{

    @Override
    public void teste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void fry(){
        System.out.println("prinç ve şehriye kavruldu ");
    }

    void boil()
    {
        System.out.println("Kısık ateşte pişirildi");
    }
}
