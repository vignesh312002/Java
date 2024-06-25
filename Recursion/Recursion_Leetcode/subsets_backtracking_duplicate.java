package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets_backtracking_duplicate {
    public static void main(String[] args) {
        int arr[]={4,4,4,1,4};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int []nums){
        List<List<Integer>> outerList =new ArrayList<>();
        List<Integer> innerList =new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, outerList, innerList);
        return outerList; 
    }
    public static void backtrack(int []nums ,int index ,List<List<Integer>> outerList,List<Integer> innerList){
        outerList.add(new ArrayList<>(innerList));
        //System.out.println(outerList);
        for (int i = index; i < nums.length; i++) {
            //System.out.println(index);
            if(i > index && nums[i]==nums[i-1]){
                continue;
            }
            innerList.add(nums[i]);
           // System.out.println(innerList);
            backtrack(nums, i+1, outerList, innerList);
            innerList.remove(innerList.size()-1);
            //System.out.println(innerList);
        }
    }
}
