package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
    public static void main(String[] args) {
        int arr[]={2,3,5};
        System.out.println(combinationSum(arr,8));
    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> outerlist =new ArrayList<>();
    List<Integer > innerlist =new ArrayList<>();
    int reaminingSum =target;
       backtrack(candidates, outerlist, innerlist,target,reaminingSum,0);
    return outerlist;
    }
    static void backtrack(int []arr,List<List<Integer>> outerlist,List<Integer> innerlist,int target,int reaminingSum,int index){
        if(reaminingSum == 0 ){
            outerlist.add(new ArrayList<>(innerlist));
            System.out.println(outerlist);
        }
        if(reaminingSum < 0){
            return ;
        }
        for (int i = index; i < arr.length; i++) {
            innerlist.add(arr[i]);
            System.out.println(innerlist);
            backtrack(arr, outerlist, innerlist, target, reaminingSum-arr[i],i);
            innerlist.remove(innerlist.size()-1);
            System.out.println(innerlist);
        }
    }
}
