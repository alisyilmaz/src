package Gun15;

public class _06_JavaNestedLoop {
    public static void main(String[] args) {
        // NOT : BU ÖRNEK ÇALIŞMA DIŞIDIR DİKKATE ALMAYINIZ

        int sinir=0;
        boolean altTaraf=false;

        for(int satir=1;satir<=5;satir++){ //satir=1,2,3,4,5 sonra 5,4,3,2,1

            if (altTaraf==false)
                 sinir=satir;
            else
                 sinir=6-satir;

            for(int j=0;j<sinir;j++) // satir=5
                System.out.print("*"); // *****

            System.out.println();

            if (altTaraf==false && satir == 5) {
                satir = 1;
                altTaraf=true;
            }

            if( altTaraf == true && satir == 5)
                break;;
        }


    }
}
