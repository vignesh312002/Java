import java.util.Arrays;

public class maxproductof_threenum {
    public static void main(String[] args) {
        int []arr={-100,-2,-3,1};
       // Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(maximumProduct1(arr));
    }
    public static  int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int positive_product=nums[n-1]*nums[n-2]*nums[n-3];
        int negative_product=nums[0]*nums[1]*nums[n-1];
        // here int the negative product 
        // if the array contains negative means the multiplication of two smallest negative number will give positive numbeer
        // two smallest number multiplied  with the largest number 
         // -100,-98 ,4=39200
        int ans=Math.max(positive_product,negative_product);
        
        return ans;
    }
    
}
