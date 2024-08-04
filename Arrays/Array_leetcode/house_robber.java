package Java.Arrays.Array_leetcode;

public class house_robber {
public static void main(String[] args) {
    int []arr={1,1};
    System.out.println(rob(arr));
}
public static int rob(int[] nums) {
    int start=nums[0];
    int end=nums[nums.length-1];
    int sum1=0; int sum2=0; 
    int sum3=start + end;
    
    if(nums.length<=2){
        return nums[0];
    }
    
    for(int i=0;i<nums.length;i=i+2){
        sum1=sum1+nums[i];

    }
    for(int i=1;i<nums.length;i=i+2){
        sum2=sum2+nums[i];

    } 
    if(sum1>sum2 && sum1>sum3){
        return sum1;
    }
    else if(sum2>sum1 &&sum2>sum3){
        return sum2;
    }
    else{
        return sum3;
    }
}
}
