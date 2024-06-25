package Java.Recursion.Backtracking;

public class Maze_With_Obstacles_4 {
   public static void main(String[] args) {
    boolean[][] matrix=
    {
        {true, true, true},
        {true, false,true},
        {true, true, true}
    };
    Printing_Path_Obstacles("", matrix, 0, 0);
   }
   static void Printing_Path_Obstacles(String p,boolean [][] maze,int r,int c){
    if(r==maze.length-1 && c==maze[0].length-1){
        System.out.println(p);
        return ;

    }
    if(maze[r][c] == false){
        return;
    }
    if(r < maze.length-1)
    {
    Printing_Path_Obstacles(p+'D',maze, r+1, c);
    }
    if(c < maze[0].length-1)
    {
    Printing_Path_Obstacles(p+'R',maze, r, c+1);
    }
} 
}
