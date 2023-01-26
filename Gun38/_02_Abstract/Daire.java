package Gun38._02_Abstract;

public class Daire extends Sekil{
    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    @Override
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return Math.PI*yaricap*2;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
