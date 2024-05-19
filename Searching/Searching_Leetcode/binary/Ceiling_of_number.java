public class Ceiling_of_number {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18}; 
        System.out.println(ceil_num(arr, 15));   
     }
    
    //ceil = smaller number greater  than equal to target
    static int  ceil_num(int []arr,int target)
   {
    //edge case
    //what if the target number is greater than the greatest number in the array 
    if(target>arr[arr.length-1]){
        return -1;
    }

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
 
return start;//return start 
} 
}
