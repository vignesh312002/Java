public class rotated_BS {
    public static void main(String[] args) {
        int arr[]={5,  6,7,8,9,10,1,2,3};
        //System.out.println(pivot_in_duplicate(arr));
        System.out.println(Rotated_search(arr,3));
    }
    public static int Rotated_search(int[] nums, int target) {
        int pivot=pivot(nums);
        // if fount meants it have two sorted array on both side 
        if(pivot == -1){
            //normal binary search
            return binarysearch(nums, target, 0, nums.length-1);
        } 
        //case 1
        if(nums[pivot]==target){
            return pivot ;
        }
        //case 2 fo instance assume target as 6
         if(target>=nums[0]){
            return binarysearch(nums, target, 0, pivot-1);
        }//case 3 for instance assume target as 0 
        //if(target<=nums[0]){
          //  return binarysearch(nums, target, pivot+1, nums.length-1);
        //}
        return binarysearch(nums, target, pivot+1, nums.length-1);
    }

//  BINARY SEARCH
    static int binarysearch(int []arr,int target,int start,int end){
   
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

// FINDING THE PIVOT ELEMENT 
     static int pivot (int []arr){
        int start=0;
        int end =arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            //case1

            if(mid<end && arr[mid]>arr[mid+1]){// if mid is last index the ou of bound error 
                return mid;                        //mid must be less then end
            }
            //case2

            if( mid>start&& arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case 3
            if(arr[start]>=arr[mid]){ //so the pivot will lie in left end=mid-1
                end=mid-1;
            }
            //case 4
            if(arr[start]<=arr[mid]){
                start=mid+1; //it will search the rigth side or the array
            }
        }
       return -1; 
    }

    //FINDING THE PIVOT WITH DUPLICATE VALUES 
    // if mid and start and end are same 
        static int pivot_in_duplicate(int []arr){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid =start+(end-start)/2;
                //case1
                if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                    start=start+1;
                    end=end+1;
                }
                //case2
                //what if the start and end are the pivot 
                //for start
                if(arr[start]>arr[start+1]){
                    return start;
                }
                else{
                    start=start+1;
                }
                // end
                if(arr[end]>arr[end-1]){
                    return end;
                }
                else{
                    end--;
                }
                //rigth side checking 
            if((arr[start]<arr[mid])|| arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            
            }
            //left side 
            else{
                end=mid-1;
            }    

        }
        return -1;
}
}