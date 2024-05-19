import java.util.Arrays;

public class smallerthancurrent {
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static  int[] smallerNumbersThanCurrent(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<arr[i] ){
                   count++; 
                }
                
        }
            result[i]=count;
        }
        return result;
    }
}
