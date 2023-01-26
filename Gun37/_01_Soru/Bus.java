package Gun37._01_Soru;

public class Bus extends Vehicle implements IDiesel{
    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
        return "bir depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "en fazla 90km hız yapabilir";
    }
}
