public class search_in_mountain_array_HARD {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3,1,3};
        System.out.println(findInMountainArray(3,arr));
    }
    public  static int findInMountainArray(int target, int[] arr) {
       int peak=findPeakElement(arr);
       int first=binarysearch(arr, target,0,peak);
       int second =order_search(arr, target, peak+1, arr.length-1); 
       if(first!=-1)
       {
        return first;
       }
       else
       {
        return second;
       }
    }
    public static int findPeakElement(int[] arr) {
        int start = 0 ;
      int end=arr.length -1;
      // int this case is the array is of huge number we should use such as long or double 
      while(start<end){
      int mid=start+(end-start)/2; 
    
      if(arr[mid]>arr[mid+1]){
          
          end=mid;
      }
    
      else{
     
          start=mid+1; //(arr[mid]<arr[mid+1])
      }
    
    }
    
    return start; 
    }
    static int  binarysearch(int []arr,int target,int start ,int end )
{
    
    // int this case is the array is of huge number we should use such as long or double 
    while(start<=end){
    int mid=start+(end-start)/2; 

    if(target>arr[mid]){
         start=mid+1;
    }
    else if(target<arr[mid]){ 
        end=mid-1;
    }
    else{
        return mid;
    }

    
}
 
return -1;//gives -1 if it the target is not present in the array 
} 
static int  order_search(int []arr,int target,int start,int end ){
    
    // int this case is the array is of huge number we should use such as long or double 
    boolean isAscending;
    if(arr[start]<arr[end]){
        isAscending=true;
    }
    else{
        isAscending=false;
    }
    
    while(start<=end){
    int mid=start+(end-start)/2; 
        
    if(arr[mid]==target){//same for both 
        return mid;
    }
    //for ascending 
    if(isAscending)
    {
    if(target>arr[mid]){
         start=mid+1;
    }
    else{
        start=mid-1;
    }
    }
    //for descending
    else{
        {
            if(target>arr[mid]){
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
    }
    
}
} 
return -1; 
}
}
