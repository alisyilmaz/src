package Gun30._01_StaticVariables.Ornek2;

public class Student {
    private int id;
    String fullName;
    static int sayac=1; // sen bitanesin
    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }// maindeki ilk 3 satır için gerekli,
     // static değişkenden sonra gerek kalmadı

    public Student(String fullName) {
        this.id = sayac++;// önce var olan deger veriliyor, sonra artıyor
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
