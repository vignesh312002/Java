package Java.Recursion.array_recursion;

import java.util.ArrayList;
 import java.util.Arrays;
import java.util.List;





public class SubSet {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(subsets(arr));
        // List<List<Integer>> ans =subset_array(arr);
        // for (List<Integer> list : ans) {
        //     System.out.println(list);
        // }

    }
   //REFER TTHIS IMAGE FOR MORE CLARIFICATION 
    //https://media.geeksforgeeks.org/wp-content/uploads/20230911132238/print-all-subsets.png


    // static List<List<Integer>> subset_array(int []arr){
    //     List<List<Integer>> outerList=new ArrayList<>();        

    //     outerList.add(new ArrayList<>());

    //     for(int num :arr) {// this loop for the num 1,2,3
    //         int n=outerList.size();
    //         for (int j = 0; j < n; j++) { 
    //             List<Integer> innerList =new ArrayList<>(outerList.get(j));
    //             innerList.add(num);               
    //             outerList.add(innerList); 
    //         }

    //     }
    //     return outerList;
    // }
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



// public static List<List<Integer>> subsets(int[]nums){
//     List<List<Integer>> result =new ArrayList<>();
//     List<Integer> subset=new ArrayList<>();
//     backtrack(nums,0,result,subset);
//     return  result;
// }  
// public static  void backtrack (int []nums,int index,List<List<Integer>> result,List<Integer> subset){
//     if(index == nums.length){
//         result.add(new ArrayList<>(subset));
//         return ;
//     }
//     subset.add(nums[index]);
//     backtrack(nums, index+1, result, subset);
//     //now backtrack
//     subset.remove(subset.size()-1);
//     backtrack(nums, index+1, result, subset);
// }
    

}
