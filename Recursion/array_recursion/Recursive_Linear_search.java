package Java.Recursion.array_recursion;


import java.util.ArrayList;

public class Recursive_Linear_search {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,5,6};
        //System.out.println(rec_search(arr, 6, 0));
        //System.out.println(rec_search_index(arr, 6, 0));
        
        //from reverse
        //System.out.println(rec_search_last(arr, 6, arr.length-1));
        //System.out.println(rec_search_index_last(arr, 6, arr.length-1));
        //ONE WAY
        //ArrayList<Integer> list=new ArrayList<>();
        //System.out .println(rec_search_Allindex(arr, 5, 0,list));
        // SECOND WAY
        //ArrayList<Integer> ans=rec_search_Allindex(arr, 5, 0,new ArrayList<Integer>());
        //System.out.println(ans);  
        
        // WITHOUT ARGUMENT 
         System.out.println(rec_search_Allindex2(arr, 5, 0));
        
    }
    static boolean rec_search(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || rec_search(arr, target, index+1);
    }
    static int rec_search_index(int []arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return rec_search_index(arr, target, index+1);
    }
    // IN REVERSE MANNER
    static boolean rec_search_last(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || rec_search_last(arr, target, index-1);
    }
    static int rec_search_index_last(int []arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return rec_search_index_last(arr, target, index-1);
    }

    //  RETURNING THE ARRAYLIST (IN THE ARGUMENT )
    static ArrayList<Integer> rec_search_Allindex(int []arr,int target,int index,ArrayList<Integer>list){
        
        if(index == arr.length){
            return list ;// return the list with the index
            
        }
        if(arr[index] == target) {
            list.add(index);
            
        }
        return rec_search_Allindex(arr, target, index+1,list);
    }
    //WITHOUT RETURNING IN THE ARGUMENT
    //
        static ArrayList<Integer> rec_search_Allindex2(int []arr,int target,int index){
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        if(index == arr.length){
            return list ;// return the list with the index
            
        }
        if(arr[index] == target) {
            list.add(index);
            
        }
        ArrayList<Integer> ansformbelowcalls= rec_search_Allindex2(arr, target, index+1);
        list.addAll(ansformbelowcalls);
        return list;
    }
} 
 