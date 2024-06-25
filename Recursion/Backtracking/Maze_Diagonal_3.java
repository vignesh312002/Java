package Java.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze_Diagonal_3 {
   public static void main(String[] args) {
    System.out.println(Printing_Path_list("", 3, 3));
   }
   static void Printing_Path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;

        }
        if(r>1)
        {
        Printing_Path(p+'D', r-1, c);
        }
        if(c>1)
        {
        Printing_Path(p+'R', r, c-1);
        }
    }

    static List<String> Printing_Path_list(String p,int r,int c){
        if(r==1 && c==1){
            List<String> list =new ArrayList<>();
            list.add(p);
            return list;

        }
        List<String> res= new ArrayList<>();
        if(r>1)
        {
        res.addAll(Printing_Path_list(p+'D', r-1, c));
        }
        if(r>1 && c>1)
        {
        res.addAll(Printing_Path_list(p+"di", r-1, c-1));
        }
        if(c>1)
        {
        res.addAll(Printing_Path_list(p+'R', r, c-1));
        }
        
        
      return res;  
    }
 
}
