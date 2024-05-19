import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[]={3,2,4,1,5}; 
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxindex= getmax_index(arr,0,last);
            swapping(arr, last, maxindex);
        }
    }
    static int getmax_index(int arr[],int start,int end){
        int temp=start;
        for (int i = start; i <= end; i++) {
            if(arr[temp]<arr[i]){
                temp=i; // here we are finding the index not the element 
            }
        }
    return temp;
    }
    static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    }
   
}
