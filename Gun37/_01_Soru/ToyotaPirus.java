package Gun37._01_Soru;

public class ToyotaPirus extends Vehicle implements IElectric,IGas{
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrik ile gider";
    }
}
