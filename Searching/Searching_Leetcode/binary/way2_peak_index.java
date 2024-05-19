public class way2_peak_index {
//MOST EFFICIENT WAY FOR TIME COMPLEXITY 
//LKEET CODE
    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
    int start = 0 ;
    int end=arr.length -1;
    // int this case is the array is of huge number we should use such as long or double 
    while(start<end){
    int mid=start+(end-start)/2; 

    if(arr[mid]>arr[mid+1]){
        //you are in the decresing part this might be the answer
        // look at the left 
        //thats why end is not mid-1
        end=mid;
    }
 
    else{
        // youare in ascending part
        start=mid+1; //(arr[mid]<arr[mid+1])
    }
// in end start == end poiting to the largerst element bcoz of 2 checks 
     // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
}
 
return start; //you can return start or end because both are in same position  
}
}