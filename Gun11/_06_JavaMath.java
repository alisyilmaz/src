package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nın mutlak degeri = "   + Math.abs(a));   // 12
        System.out.println("a ve b den büyük olanı = "+ Math.max(a,b)); // 4
        System.out.println("a ve b den küçük olanı = "+ Math.min(a,b)); // -12
        System.out.println("2 nin 3. kuvveti       = "+ Math.pow(2,3)); // 8
        System.out.println("b nin karekökü         = "+ Math.sqrt(b)) ; // 2
        System.out.println("round(yuvarlama) 3.1   = "+ Math.round(3.1)); // 3
        System.out.println("round 3.5              = "+ Math.round(3.5)); // 4

        System.out.println("ceil  3.1 = "+Math.ceil(3.1));// bu rakamdan büyük en yakın tam sayı
        System.out.println("ceil  3.5 = "+Math.ceil(3.5));// bu rakamdan büyük en yakın tam sayı
        System.out.println("floor 3.1 = "+Math.floor(3.1));// bu rakamdan küçük en yakın tam sayı
        System.out.println("floor 3.5 = "+Math.floor(3.5));// bu rakamdan küçük en yakın tam sayı

        int enb=Gun20._01_JavaMethod.enbBul(a,b);
    }
}
