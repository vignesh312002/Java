package Java.Arrays.Array_leetcode;

import java.util.Arrays;

public class sort_color {
 public static void main(String[] args) {
    int []arr={1,0,2};
    sortColors(arr);
    System.out.println(Arrays.toString(arr));
 }  
 public static  void sortColors(int[] nums) {
    int start=0;
    int end =nums.length-1;
    int index=0;
    while(index <= end){
     if(nums[index]==0){
        swapping(start,index,nums);
        start++;index++;
     }
     else if(nums[index]==2){
         swapping(index,end,nums);
         end--;
     }
     else{
         index++;
     }
    }

 }
 public static void swapping(int start,int end ,int []arr){
     int temp=arr[start];
     arr[start]=arr[end];
     arr[end]=temp;
 }
}
