package Gun29.Soru;

public class Hesap {
    private int toplamYatan=0;
    private int toplamCekilen=0;
    private int bakiye=0;

    public void paraYatir(int yatanPara)
    {
        toplamYatan=toplamYatan+yatanPara;
        bakiye=bakiye+yatanPara;
    }

    public void paraCek(int cekilenPara)
    {
        toplamCekilen=toplamCekilen+cekilenPara;
        bakiye=bakiye-cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "\nyatan=" + toplamYatan +
                "\n, cekilen=" + toplamCekilen +
                "\n, bakiye=" + bakiye +
                '}';
    }
}
