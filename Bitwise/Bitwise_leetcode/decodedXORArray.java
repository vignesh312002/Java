import java.util.Arrays;

public class decodedXORArray {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(Arrays.toString(decode(arr, 1)));
    }
    public static int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int [] arr=new int[n+1];
        arr[0]=first;
        for(int i=0;i<n;i++){
            arr[i + 1]=arr[i] ^ encoded[i];
        }
        return arr;
    }
}
