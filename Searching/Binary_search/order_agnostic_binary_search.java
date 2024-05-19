public class order_agnostic_binary_search {
    public static void main(String[] args) {
        //int []arr={2,3,4,5,9,25,88};//ascending
        int []arr={88,35,9,5,4,3,2,1}; //descending
        int target=88;
        System.out.println(order_search(arr, target));
    }


    static int  order_search(int []arr,int target){
        int start = 0 ;
        int end=arr.length -1;
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
