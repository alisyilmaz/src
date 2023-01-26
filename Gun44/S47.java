package Gun44;

public class S47 {
    public static void main(String[] args) {
        String[] strs={"A","B"};
        int idx=0;

        for(String s : strs){
            strs[idx].concat(" element "+idx);  //concat deger atamaz
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);
        }
    }
}
