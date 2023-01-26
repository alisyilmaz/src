package Gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yıl ömrü var";
    }

    @Override
    public String drive() {
        return "Auto pilot özelliği var";
    }
}
