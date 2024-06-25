package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets_backtracking {
    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println((subsets(arr)));
    }
public static List<List<Integer>> subsets(int []nums){
    List<List<Integer>> outerlist =new ArrayList<>();
    List<Integer> innerList=new ArrayList<>();
    Arrays.sort(nums);
    backtrack(nums,0,outerlist,innerList);
    return outerlist;
}
private static void backtrack(int[] nums, int index, List<List<Integer>> outerlist, List<Integer> innerList) {
    outerlist.add(new ArrayList<>(innerList));
    for (int i = index; i < nums.length; i++) {
        innerList.add(nums[i]);
        backtrack(nums, i+1, outerlist, innerList);
        innerList.remove(innerList.size()-1);

    }
    
}
}
