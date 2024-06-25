package Java.Recursion.array_recursion;

import java.util.ArrayList;
import java.util.List;

public class subarrays {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        // sub_arrays(arr);
        System.out.println(sub_arrays_1(arr));
    }
    static void sub_arrays(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                for (int j2 = i; j2 <= j; j2++) 
                    System.out.print(arr[j2]+ " ");
                   
             System.out.println("");    
            }    
            
        }
        
    }
    static List<List<Integer>> sub_arrays_1(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> subArray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subArray.add(arr[k]);
                }
                result.add(subArray);
            }
        }
        return result;
    }


}
