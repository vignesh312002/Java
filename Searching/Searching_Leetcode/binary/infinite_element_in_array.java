public class infinite_element_in_array {
    public static void main(String[] args) {
        int []arr={2,3,5,6,7,8,10,11,12,15,20,23,30,31};
        System.out.println(range(arr, 15));
    }

static int range(int []arr,int target){
    int start=0;
    int end =1;

    while(target>arr[end]){
        int temp=end+1;// we need to use start down so using temp
        end=end+(end-start+1)*2;   //e-(s-1)= (e-s+1)
        start=temp;
    } 
    return binarysearch(arr, target,start,end);
}




    static int  binarysearch(int []arr,int target,int start,int end)
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
 
return -1;
}

}
