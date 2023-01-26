package Gun28._02_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap(){
        this("",0,"");
    }

    public Kitap(String name, int publishYear, String author)
    {
       this.name = name;
       this.publishYear = publishYear;
       this.author =author;
    }

    public Kitap(String name, int publishYear)
    {
        this(name,publishYear,"");
    }


    public String toString(){
        return name+" "+author+" "+publishYear;
    }

}
