public class find_peak_element{
 public static void main(String[] args) {
    int arr[]={1,2,3,1};
    System.out.println(findPeakElement(arr));
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
}
