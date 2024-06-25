package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;



public class PermutationDuplicate {
    public static void main(String[] args) {
        int []nums={1,2,2} ;
        System.out.println(permutation(nums));
       }
    public static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sublist=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(nums, list, sublist,used);
        return list ;
    }
    public static void backtrack(int nums[],List<List<Integer>> list,List<Integer> sublist,boolean []used){
        if(nums.length== sublist.size()){
            list.add(new ArrayList<>(sublist));
            System.out.println(list);
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                if( used[i] || i>0 && nums[i] == nums[i-1] && used[i] !=used[i-1]  ){
                    continue;
                }
                used[i]=true;

                sublist.add(nums[i]);
                System.out.println(sublist);
                backtrack(nums, list, sublist,used);
                used[i]=false;
                sublist.remove(sublist.size()-1);
                System.out.println(sublist);
        
                }
            }
        }
    }

