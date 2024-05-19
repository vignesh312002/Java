public class Floor_of_number {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18}; 
        System.out.println(floor_num(arr, 15));
    }
    //greatest number smaller than equal to target
    static int  floor_num(int []arr,int target)
    {
        //if the target lesser tha  the smallest array elemtnt it will return -1
        if(target<arr[0]){
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
     
    return end;//return end
    } 
}
