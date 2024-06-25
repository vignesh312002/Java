package Java.Recursion.Backtracking;

public class N_Knigths {
    public static void main(String[] args) {
        int n=4;
        boolean[][]board=new boolean[n][n];
        Knigths(board, 0, 0, 4);
    }
    static void Knigths(boolean [][]board,int row, int col,int target){
        if(target==0){
            display(board);
            System.out.println();
            return ;
            
        }
        
        if(row == board.length-1 && col==board.length ){
            return;//col outof bound 
        }

        if(col==board.length){
            Knigths(board, row+1, 0, target);
            return;
        }

        if(safe(board,row,col)){
            board[row][col]=true;
            Knigths(board, row, col+1, target-1);
            board[row][col]=false;
        }
        Knigths(board, row, col+1, target);//not safe so move ahead

    }
    private static boolean safe(boolean[][] board, int row, int col) {
       //4 condtions for checking the position 

        // if(row>=0 && row<board.length &&col>=0 && col<board.length )
        //each cndition addthis to avoding callin the function 
        if (isValid(board, row-2, col-1)) {
        if(board[row-2][col-1]==true){
            return false;
        }
       }
       
       if (isValid(board, row-2, col+1)) {
        if(board[row-2][col+1]==true){
            return false;
        }
       }
       if (isValid(board, row-1, col+2)) {
        if(board[row-1][col+2]==true){
            return false;
        }
       }

       if (isValid(board, row-1, col-2)) {
        if(board[row-1][col-2]==true){
            return false;
        }
       }
    return true;
    }
    private static boolean isValid(boolean[][]board,int row,int col){
        if(row>=0 && row<board.length &&col >= 0 && col<board.length ){
            return true ;
        }
        return false;
    }
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element: row ) {
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
       
}
}
