package Java.Recursion.Backtracking;

public class Maze_All_Directions_5 {
    public static void main(String[] args) {
        boolean[][] matrix=
        {
            {true, true, true},
            {true, true,true},
            {true, true, true}
        };
        Printing_Path_AllDirection("", matrix, 0, 0);
    }
    // left rigth up down
    static void Printing_Path_AllDirection(String p,boolean [][] maze,int r,int c ){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
    
        }
         if(maze[r][c] == false){ //the river in matrix
             return;
         }

        //  I AM CONSIDERING IT AS IN  MY CURRETNT PATH  
       /*THE FIRST LINE */
        maze[r][c]= false;  // we are changing the treu to false here

        if(r < maze.length-1)
        {
        Printing_Path_AllDirection(p+'D',maze, r+1, c);
        }
        if(c < maze[0].length-1)
        {
        Printing_Path_AllDirection(p+'R',maze, r, c+1);
        }
        if(r>0)
        {
        Printing_Path_AllDirection(p+'U',maze, r-1, c);
        }
        if(c>0)
        {
        Printing_Path_AllDirection(p+'L',maze, r, c-1);
        }
        //at this line the function will be over 
        //so before the function gets removed ,also REVERSE the changes that ere made by that function
        /*THE SECOND LINE  */
         maze[r][c] = true;

        // THE ADD OF FIRST AND SECOND LINE IS BACKTRACKING

    } 
}
