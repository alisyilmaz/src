package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();

        GreekSalad g=new GreekSalad();
        g.setName("Greek Salad");
        g.madeIn();
        g.taste();

        CheeseCake c=new CheeseCake();
        c.setName("CheeseCake");
        c.madeIn();
        c.taste();

        SezerSalad s=new SezerSalad();
        s.setName("SezerSalad");
        s.madeIn();
        s.taste();
    }
}
