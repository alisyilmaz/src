package Gun38._02_Abstract;

public abstract class Sekil {
    private String name;
    abstract double alan();  // soyut - abstract
    abstract double cevre(); // soyut

    public void ciz() // somut
    {
        System.out.println(name+" isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "Sekil :" +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\ncevre='" + cevre() + '\'' +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
