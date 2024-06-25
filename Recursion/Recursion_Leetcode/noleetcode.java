package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class noleetcode {
    public static void main(String[] args) {
        int []arr={1,2};
        System.out.println(permute(arr));

    }
 //COMBINATION WITH REPEATION 
     public static List<List<Integer>> permute(int []nums){
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> subset =new ArrayList<>();
        
        backtrack(nums, list, subset );
        return list ;
     }
     static void backtrack(int nums[],List<List<Integer>> list,List<Integer> subset ){
        if(subset.size()==nums.length){
            list.add(new ArrayList<>(subset));
            System.out.println(list);

        }
        else{
            for (int i = 0; i < nums.length; i++) {
                subset.add(nums[i]);
                System.out.println(subset);
                backtrack(nums, list, subset);
                subset.remove(subset.size()-1);
                System.out.println(subset);
            }
        }

     }
}
