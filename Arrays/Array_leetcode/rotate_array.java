

public class rotate_array {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7};
        rotate(arr, 3);
        print(arr);
    }
    static void print(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;   //edge case important
        }
       reverse(nums, 0, nums.length-1);
       reverse(nums, 0, k-1);
       reverse(nums,k,nums.length-1);
    }
    static void reverse(int []arr,int start,int end ){
        while(start<end){
            int temp=0;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
