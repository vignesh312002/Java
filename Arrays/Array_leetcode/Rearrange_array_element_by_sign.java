package Java.Arrays.Array_leetcode;

import java.util.Arrays;

public class Rearrange_array_element_by_sign {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        int j=1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
                ans[k]=nums[i];
                i=i+2;
            }
            else{
                if(nums[k]<0)
                ans[k]=nums[j];
                j=j+2;
            }
        }
        return ans;
    }
}
