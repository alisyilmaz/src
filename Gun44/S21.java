package Gun44;

public class S21 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4}; // indexler : 0,1,2,3 toplam 4 eleman
        int i=0;

        do {
            System.out.print(arr[i] + " "); // 1 2 3 4
            i++;
        }while(i < arr.length + 1); // i < 5

    }
}
