package Gun33._02_Inheritance;

public class Kedi extends Hayvan{
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("miyav miyav");
    }
}
