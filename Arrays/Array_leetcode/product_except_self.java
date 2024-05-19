import java.util.Arrays;

public class product_except_self {
    public static void main(String[] args) {
        int []arr={2,5,4,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public  static int[] productExceptSelf(int[] nums) {
        int array[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i]=sum(nums) /nums[i];
        }
        return array;
        }
    
    public static int sum (int[] arr) {
        int sum=1;
        for(int i=0;i<arr.length;i++){
            sum=sum*arr[i];
        }
        return sum ;
    }
}
