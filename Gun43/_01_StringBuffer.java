package Gun43;

public class _01_StringBuffer {
    public static void main(String[] args) {

        String cumle="";

        cumle = cumle +"Bugün";  // + işareti stringlerde birleştime yapar
        cumle = cumle +" hava";
        cumle = cumle +" çok soğuk";

        System.out.println("cumle="+ cumle);
        System.out.println("cumle.concat()="+ cumle.concat(" fakat dün sıcaktı"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat(" fakat dün sıcaktı"); // concat de birleştirir, ama atama ister
        System.out.println("cumle = " + cumle);


        // ** StringBuilder **/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün");  // append : ekle, atama gerektirmez, ekler
        cumle2.append(" hava");
        cumle2.append(" soğuk");

        System.out.println("cumle2 = " + cumle2);

        /** +, concat, StringBuilder 3 model in hızı test edilecek **/

        long startTime= System.currentTimeMillis();
        String test1="";
        for (int i=0; i<10000 ; i++)
            test1 = test1+("merhaba");
        System.out.println("için süre" + (System.currentTimeMillis()-startTime)+"ms");


        startTime= System.currentTimeMillis();
        String test2="";
        for (int i=0; i<10000 ; i++)
            test2 = test2.concat("merhaba");
        System.out.println("concat için süre" + (System.currentTimeMillis()-startTime)+"ms");


        startTime= System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i=0; i<1000;i++)
            test3= test3.append("merhaba");

        System.out.println("StringBuilder için süre " + (System.currentTimeMillis()-startTime)+"ms" );

    }






}


