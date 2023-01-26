package Gun28._03_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap() {
    }

    public Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Kitap(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
