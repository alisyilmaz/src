package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar(310, "model 5");
        ToyotaPirus pirus=new ToyotaPirus(1200, "sedan");
        Bus bus=new Bus(7000, "IVECO");

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(pirus);
        arabalar.add(bus);

        for(Vehicle v: arabalar){
            System.out.println("---------------------------");
            System.out.println(v.getClass().getSimpleName()); // class ın adını verir
            System.out.println("---------------------------");

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof TeslaCar) {
                System.out.println( ((TeslaCar) v).drive() );
                System.out.println( ((TeslaCar) v).changeBattery() );
            }
            else
            if (v instanceof ToyotaPirus) {
                System.out.println( ((ToyotaPirus) v).drive() );
                System.out.println( ((ToyotaPirus) v).changeBattery() );
                System.out.println( ((ToyotaPirus) v).changeOil() );
            }
            else
            if (v instanceof Bus) {
                System.out.println( ((Bus) v).drive() );
                System.out.println( ((Bus) v).changeDiesel() );
            }
        }



    }
}
