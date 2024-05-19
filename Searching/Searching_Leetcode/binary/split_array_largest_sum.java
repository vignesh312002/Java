

public class split_array_largest_sum {
    public static void main(String[] args) {
        int arr[]={7,2,5,8,10};
        System.out.println(splitArray(arr,2));
    }
    public static int splitArray(int[] nums,int k) {
     int start=0;
     int end =0;

     for (int i = 0; i < nums.length; i++) {
        // here the start the is the max value in array 
        //see notes for explenantion
        start=Math.max(start,nums[i]);
        // end is the total sum of the array 
        end=end+nums[i];
     }
     while(start<end){
          int mid =start+(end-start)/2;

          int sum =0;
          int pieces=1;
          for (int i = 0; i < nums.length; i++) {
                if(sum+nums[i]>mid){
                    //you cannot add the next element in to the sub array, mke new one 
                    //you are adding the number in new sub array then the sum = num 
                    // if adding 8 in new sub array means the sum is 8 so num =sum 
                    sum=nums[i];
                    pieces++;
                }
                else{
                    sum=sum+nums[i];
                }
            }
          if(pieces>k){
            start=mid+1;
          } 
          else{
            end=mid;
          }                 
          }

     
     return end;// we can return end or start because at the end both points the same place
    
    }
}
