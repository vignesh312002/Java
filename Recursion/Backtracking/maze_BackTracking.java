package Java.Recursion.Backtracking;

import java.util.Arrays;

public class maze_BackTracking{
    public static void main(String[] args) {
        boolean matrix[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int path[][]=new int[matrix.length][matrix[0].length];
        maze("", matrix, path, 0, 0, 1);
    }
    static void maze (String p,boolean[][] matrix,int[][]path ,int row,int col,int level){
        if(row ==matrix.length-1 && col==matrix[0].length-1){
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(p);
            // for (int[] element : path) {
            //     System.out.println(Arrays.toString(element));
            // }
            return ;
        }
        if(matrix[row][col]==false){
            return;
        }
        path[row][col]=level;
        matrix[row][col]=false;
        if(row<matrix.length-1) 
            maze(p+'D',matrix,path, row+1, col,level+1);

        if(col<matrix[0].length-1)
            maze(p+'R',matrix,path, row, col+1,level+1);

        if(row>0)
            maze(p+'U', matrix,path, row-1, col,level+1);
        
        if(col>0)
            maze(p+'L', matrix,path, row, col-1,level+1);
        
        matrix[row][col]=true;
        path[row][col]=0;
    }
}
