public class Rotation_count {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        System.out.println(rotationcount(arr));
    }
    static int rotationcount(int []arr){
        int count =0;
       /*  if(pivot(arr)==-1){
            return 0;      //edge case not need because if pivot not found it will return -1 
                           // so -1 +1 will give 0 
        }
        */
        count =pivot(arr)+1; //if pivot not found 
        //     -1  +   1   =  0
        return count;
    }
    // for 
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
