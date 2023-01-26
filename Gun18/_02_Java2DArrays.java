package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi=new int[10]; // boş default 0 olan
        int[] dizi2={2,3,4,5,6,7,56,67,77};

        int[][] tablo=new int[2][3]; // 2 Satır row, 3 sütun column,
                                     // boş default değer 0 2x3 kadar 6 adet sayı
        int[][] tablo2={
                { 2 ,3 ,4    }, // 0.Satır
                { 34,45,5    }  // 1.Satır
                       };
        // tek forlu yöntem uzun ve yorucu
        for (int i = 0; i < 2; i++) {
            System.out.print(tablo2[i][0]+" "); // her bir satırın 0.elemanı
            System.out.print(tablo2[i][1]+" "); // her bir satırın 1.elemanı
            System.out.print(tablo2[i][2]+" "); // her bir satırın 2.elemanı

            System.out.println(); // her satırın yazma işleminden sonra satır atlanıyor
        }
        System.out.println("--------------------------");
        // 2 forlu yöntem kesin vey hatasız
        for (int satir = 0; satir < 2; satir++) {

            for(int sutun=0; sutun <3; sutun++) { // her bir satırın sütunlarını yazdıran for
                System.out.print(tablo2[satir][sutun] + " ");
            }

            System.out.println(); // her satırın yazma işleminden sonra satır atlanıyor
        }


    }
}
