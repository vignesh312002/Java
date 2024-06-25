package Java.Recursion.Backtracking;

import java.util.Arrays;

public class Print_matrix_and_path_6 {
    public static void main(String[] args) {
        boolean[][] matrix=
        {
            {true, true, true},
            {true, true,true},
            {true, true, true}
        };
        int path[][] =new int[matrix.length][matrix[0].length];
        Printing_Path_AllPath("", matrix, 0, 0, path, 1);
    }
    static void Printing_Path_AllPath(String p,boolean [][] maze,int r,int c,int [][]path ,int level ){
        if(r==maze.length-1 && c==maze[0].length-1){
          path[r][c]=level;
            for(int []arr: path){
            System.out.println(Arrays.toString(arr));
           }
           System.out.println(p);
           System.out.println();
            return ;
    
        }
         if(maze[r][c] == false){ //the river in matrix
             return;
         }

        //  I AM CONSIDERING IT AS IN  MY CURRETNT PATH  
       /*THE FIRST LINE */
        maze[r][c]= false;  // we are changing the treu to false here
         //for the array
         path[r][c] =level;
        if(r < maze.length-1)
        {
            Printing_Path_AllPath(p+'D',maze, r+1, c,path,level+1);
        }
        if(c < maze[0].length-1)
        {
            Printing_Path_AllPath(p+'R',maze, r, c+1,path,level+1);
        }
        if(r>0)
        {
            Printing_Path_AllPath(p+'U',maze, r-1, c,path,level+1);
        }
        if(c>0)
        {
            Printing_Path_AllPath(p+'L',maze, r, c-1,path,level+1);
        }
        //at this line the function will be over 
        //so before the function gets removed ,also REVERSE the changes that ere made by that function
        /*THE SECOND LINE  */
         maze[r][c] = true;
         path[r][c]=0;
        // THE ADD OF FIRST AND SECOND LINE IS BACKTRACKING

    } 
}
