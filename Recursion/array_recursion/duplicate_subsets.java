package Java.Recursion.array_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicate_subsets {
    public static void main(String[] args) {
        int []arr={1,2,2};
        //System.out.println(subset_array(arr));
        List<List<Integer>> list= subset_array(arr);  
        for (List<Integer> element : list) {
            System.out.println(element);
        }
    }
    static List<List<Integer>> subset_array(int []arr){
        List<List<Integer>> outerList=new ArrayList<>();        
        Arrays.sort(arr);
        outerList.add(new ArrayList<>());
        int start=0;
        int end =0;
        for(int i=0;i<arr.length;i++) {// this loop for the num 1,2,3
            int n=outerList.size();
            start=0;
            if(i>0 && arr[i]==arr[i-1]  ){
                start=end+1;
            
            }
            end=outerList.size()-1;

            for (int j = start; j < n; j++) { 
            
                List<Integer> innerList =new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);               
                outerList.add(innerList); 
            }

        }
        return outerList;
    }
}
