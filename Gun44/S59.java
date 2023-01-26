package Gun44;

public class S59 {
    public static void main(String[] args) {
        int[] intArr={8,16,32,64,128};

        //a out of bounds hatası : runtime error
//        for(int i: intArr) //i= 8,16,32,64,128
//            System.out.println(intArr[i]+" ");

        // b Doğru
        for(int i: intArr) //i= 8,16,32,64,128
            System.out.print(i+" ");

        //compile  hatalı compile error
//        for(int i=0: intArr){
//            System.out.println(intArr[i] + " ");
//            i++;
//        }

//        System.out.println();   // sadece indexleri yazar
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.print(i+" "); // 0,1,2,3,4
//        }

        // e doğru
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+" ");
        }

        //compile  hatalı compile error
//       for(int i; i< intArr.length ; i++){
//           System.out.println(intArr[i]);
//       }


    }
}
