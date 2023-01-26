package Gun33._02_Inheritance;

public class Ordek extends Hayvan{
    private double kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi, double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        System.out.println("vak vak");
    }

    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
