import java.util.Arrays;

public class concatination_of_arrays {
    public static void main(String[] args) {
       int arr[]={1,2,3,4} ;
       System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static  int[] getConcatenation(int[] nums) {
        /*int n = nums.length;
        int[] ans = new int[2 * n];
        
        // Copy nums to ans
        System.arraycopy(nums, 0, ans, 0, n);
        
        // Copy nums again to the second half of ans
        System.arraycopy(nums, 0, ans, n, n);
        
        return ans;*/
        
        int ans[]=new int [2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];           
        }
        
        return ans;
        

    }
}
