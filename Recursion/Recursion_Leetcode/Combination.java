package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;


public class Combination {
    public static void main(String[] args) {
        int n=4;
        System.out.println(combine(n, 2));
    }
     public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outerlist=new ArrayList<>();
        List<Integer> innerlist =new ArrayList<>();
        backtrack(n, k, outerlist, innerlist, 1);
             return outerlist;
    }
    public static void backtrack(int n,int k,List<List<Integer>> outerlist,List<Integer> innerlist,int index){
      if(innerlist.size()==k){
        outerlist.add(new ArrayList<>(innerlist));
      }
      else{
     for (int i = index; i <= n; i++) {
        innerlist.add(i);
        backtrack(n, k, outerlist, innerlist, i+1);
        innerlist.remove(innerlist.size()-1);
     }   
    }
    }
}
