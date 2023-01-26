package Gun39._05_OOP_Soru;

public class Borsh implements IFood{

    @Override
    public void teste() {
        System.out.println("Sıcak sebze çorbası ");
    }

    @Override
    public double ucret() {
        return 40;
    }

    void boil()
    {
        System.out.println("Kısık ateşte kaynatılıyor");
    }

    void eatTomarrow()
    {
        System.out.println("Bir gün sonra servis edilir");
    }
}
