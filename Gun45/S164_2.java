package Gun45;

public class S164_2 {
    public static void main(String[] args) {

        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for(int e: data)
        {
            // 2014 ler gelidiğinde çalışMAYACAK
            if ( e!= key){
                continue;
            }

            count++;  // 1 2
        }

        System.out.println(count+" Found");
    }
}

// 2 found
