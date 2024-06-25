package Java.Recursion.array_recursion;

import java.util.ArrayList;
import java.util.List;

public class newl {
    public static void main(String[] args) {
        int []arr={1,2,3};
        List<List<Integer>> list =subsets(arr);
        System.out.println(list);
    }
    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer =new ArrayList<>();
        
        outer.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int n=outer.size();
            for(int j=0;j<n;j++){
                //ArrayList inner=new ArrayList<>(outer.get(j));
               // inner.add(nums[i]);
             // outer.add(inner);
            }
        
        } 
        return outer;
    }
}
