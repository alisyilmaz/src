package Gun36._06_Interface;

public class Dikdortgen implements ISekil{


    @Override
    public double alan(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre(double kisaKenar, double uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }
}
