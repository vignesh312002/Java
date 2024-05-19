import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
       int []arr={5,3,4,1,2} ;
       insertion(arr);
       System.out.println(Arrays.toString(arr) );
    }
    static void insertion(int []arr){
        //array length should be n-2 ALWAYS
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swapping(arr, j, j-1);
                }
                else{
                    break;
                }


            }
        }
    }
    static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    } 
}
