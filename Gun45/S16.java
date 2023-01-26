package Gun45;

public class S16 {
    public static void main(String[] args) {
         int cnt=0;
        String[][] arr = {
                {"A", "B", "C"},
                {"D", "E"}
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // ABCDE

                if (arr[i][j].equals("B")) {
                    continue; // etkisi yok
                    // çünkü kendisinden sonra gelen kod yok
                }
            }

            continue; // etkisi yok
            // çünkü kendisinden sonra gelen kod yok
        }
    }
}
// ABCDE