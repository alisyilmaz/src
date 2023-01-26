package Gun44;

public class S23 {
    public static void main(String[] args) {
        int[] stack = {10,20,30}; // 0,1,2 indexler
        int size=3;
        int idx=0;

        //  burdaki idx en son kaça getirmeli ki : cevap 2

//        do{
//            idx++;   // 1
//        }while(idx >= size); // ( 1 >= 3) devam etmez  : sonuç 20 yazdırır

//        while(idx < size){ //( idx < 3)
//            idx++;   // en son 3 oldu
//        }   // sonuç  exception çünkü idx en son 3

        do{
            idx++;
        }while(idx < size-1);//  (idx < 2)  (1<2)

        System.out.println("idx = " + idx);
        System.out.println("The Top elemen : " + stack[idx]);  // 30
    }
}
