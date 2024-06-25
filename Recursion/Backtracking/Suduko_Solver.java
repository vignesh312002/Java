package Java.Recursion.Backtracking;

public class Suduko_Solver {
    public static void main(String[] args) {
        int [][] board=
        {
        {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0},
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };

        if(solve(board)){
            show(board);
        }
        else{
            System.out.println("cannot able to solve the suduko");
        }
    }
static boolean solve(int[][] board){
    int n=board.length;
    int row= -1;
    int col= -1;

    //FINDING THE EMPTY SPACE
    boolean emptySpace = true;   
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(board[i][j] == 0){
                row=i;
                col=j;
                emptySpace=false;
                break;
            }
        }
        //find empty space in row then break
        if(emptySpace==false){
            break;   
        }
    }
    if(emptySpace==true){
        return true;
        //suduko is solved in that 
    }
    
    //HERE WE ARE PLACING THE NUMBER ONE BY ONE AND CHECKING THE SAFE PLACE
    //AND BACKTRACK
    for (int number =1 ; number <= 9; number++) {
        if(issafe(board, row, col, number)){
            board[row][col]= number;
            if(solve(board)){
                //fount the answer
                return true ;
            }
            else{
                //backtrack
                board[row][col]=0;
            }
        }
    }
    return false; //it cannot be solved
    }

   public static boolean issafe(int[][]board,int row ,int col,int num){
    //FOR THE ROW
    for (int i = 0; i < board.length; i++) {
        //chack whether the number is in the row 
        if(board[row][i] == num){
            return false;
        }
    }
    //FOR THE COL
    for (int j = 0; j < board.length; j++) {
         if(board[j][col]==num){
             return false;
     }
    }
    //  for (int[]nums: board) {
    //      if(nums[col]==num){
    //          return false;
    //      }
    //  }
    //FOR THE BOX (3X3) 
    int sqrt=(int)(Math.sqrt(board.length));
    int rowStart= row- row % sqrt;
    int colStart= col-col % sqrt;

    for (int i = rowStart; i < rowStart+ sqrt; i++) {
        for (int j = colStart; j < colStart+sqrt; j++) {
            if(board[i][j]==num){
                return false;
                
            }
        }   
    }
    return true;
   } 

   private static void show(int[][]board)
   {
    for (int i = 0; i < board.length; i++) 
    {
        for (int j = 0; j < board.length; j++) 
        {
            System.out.print(board[i][j]+" " );
        }
        System.out.println();
    }
   }
}
