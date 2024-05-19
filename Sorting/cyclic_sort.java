import java.util.Arrays;
//APPLICABLE FOR RANGE FROM 1 - N

public class cyclic_sort {
      public static void main(String[] args) {
        int []arr={1,3,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
      }
      static void cyclic(int []arr){
        for (int i = 0; i < arr.length;) {
            int correct=arr[i]-1;
            if(i==correct){
                i++;
            }
            else{
                swapping(arr, i, correct);
            }

        }
        
      }
      static void cycle(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(i==correct){
                i++;
            }
            else{
                swapping(arr, i, correct);
            }
        }
      }
      static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    }
}
