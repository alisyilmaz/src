package Gun45;

public class S46 {
    public static void main(String[] args) {
        String names[] ={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];

//        for (String p : pwd)
//            System.out.println(p);

        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6); // omas  pwd[0]= omas , pwd[1], pwd[2]
                idx++;
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid name");
        }

        for (String p : pwd)
            System.out.println(p);  // omas null null

    }
}
// Invalid name
// omas
// null
// null