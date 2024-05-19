public class binary_search {
public static void main(String[] args) {
   int []arr={1,2,6,8,10,23,45};
  // int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19}; 
   System.out.println(binarysearch(arr, 100));
}   
static int  binarysearch(int []arr,int target)
{
    int start = 0 ;
    int end=arr.length -1;
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
}
