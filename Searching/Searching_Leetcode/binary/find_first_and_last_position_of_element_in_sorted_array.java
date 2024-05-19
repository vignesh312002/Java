public class find_first_and_last_position_of_element_in_sorted_array {
  public static void main(String[] args) {
    int []nums={5,7,7,7,7,8,8,10};
    //  ANOTHER WAY OF SOLVING IN LEET CODE ONLY 
    int target=7;
    System.out.println(searchRange(nums,target));// return address but in leetcode return address
    //int[] result = searchRange(nums, target);
      //  System.out.println("First Position: " + result[0]);
        //System.out.println("Last Position: " + result[1]);
    
  } 
  public static  int[] searchRange(int[] nums, int target) {
    
    int []ans={-1,-1};
    ans[0]=SearchFirst(nums, target);
    ans[1]=SearchLast(nums, target);
    /*int start=SearchFirst(nums, target);
    int end=SearchLast(nums, target);

    ans[0]=start; 
    ans[1]=end;*/
    return ans;
  }

  
   static int SearchFirst(int[]nums,int target){
    int ans= -1;
    int start = 0 ;
    int end=nums.length -1;
    // int this case is the array is of huge number we should use such as long or double 
    while(start<=end){
    int mid=start+(end-start)/2; 

    if(target>nums[mid]){
         start=mid+1;
    }
    else if(target<nums[mid]){ 
        end=mid-1;
    }
    else{
      //potential ans founded
        ans= mid;
        end=mid-1;
        

    } 
}
return ans;
  }
   static int SearchLast(int[]nums,int target){
    int ans= -1;
    int start = 0 ;
    int end=nums.length -1;
    // int this case is the array is of huge number we should use such as long or double 
    while(start<=end){
    int mid=start+(end-start)/2; 

    if(target>nums[mid]){
         start=mid+1;
    }
    else if(target<nums[mid]){ 
        end=mid-1;
    }
    else{
      //potential ans founded
        ans= mid;
        start=mid+1;
        

    } 
}
return ans;
  }
  
}
