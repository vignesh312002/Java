package Java.Recursion.level1_recursion;

public class binary_search {
    public static void main(String[] args) {
        int arr[]={-1,2,3,4,55,77};
        int target=55;
        System.out.println(binary(arr, target, 0, arr.length-1));
}
public static int binary(int []arr ,int target,int start,int end ){
    if (start>end){
        return -1;
    }
    int middle =start+ (end-start) /2;
    
    if(arr[middle]==target){
        return middle;
    }
    if(target<arr[middle]){
        return binary(arr, target,start,middle-1);
    }
    if(target>arr[middle])
        return binary(arr, target,middle+1,end) ;
    return target;

}

}
