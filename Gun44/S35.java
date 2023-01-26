package Gun44;

public class S35 {
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={1,2,3,4,5};

        nums2=nums1; // dizi eşitlendiğinde referans tip
        // olduğundan artık diğerinin pointini gösterir.

        for(int x : nums2)
            System.out.print(x + ":");
    }
}
