package Gun39._05_OOP_Soru;

public class TechnoKitchen {

    public static void hazirla(IFood f)
    {
        System.out.println(f.getClass().getSimpleName());
        if (f instanceof AdanaKebap)
        {
            ((AdanaKebap)f).marine();
            ((AdanaKebap)f).grill();
        }
        else
        if (f instanceof Lahmacun)
        {
            ((Lahmacun)f).dough();
            ((Lahmacun)f).addMeat();
            ((Lahmacun)f).bake();
        }
        else
        if (f instanceof Borsh)
        {
            ((Borsh)f).boil();
            ((Borsh)f).eatTomarrow();
        }
        else
        if (f instanceof Palov)
        {
            ((Palov)f).fry();
            ((Palov)f).boil();
        }

        f.teste();
        System.out.println();
    }

}
