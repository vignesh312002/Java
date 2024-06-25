package Java.Recursion.Backtracking;



public class N_knight_own {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        Knigth(board, 0, 0, 4);
    }
    static void Knigth(boolean [][]board,int row,int col,int knight){
        if(knight==0){
            display(board);

            System.out.println();
            return;
        }
        if(row == board.length-1 && col==board.length ){
            return;//col outof bound 
        }

        if(col==board.length){
            Knigth(board, row+1, 0, knight);
            return;
        }
        
        if(safe(board,row,col)){
            board[row][col]=true;
            Knigth(board, row, col+1, knight-1);
            board[row][col]=false;
        }
        Knigth(board, row, col+1, knight);

    }
     static boolean safe(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]==true){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]==true){
                return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]==true){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]==true){
                return false;
            }
        }
        return true;
    }
    private static boolean isValid(boolean board[][],int row,int col){
        if(row>=0 && row<board.length &&col>=0 && col<board.length ){
            return true;

        }
        return false;
    }
    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==true){
                    System.out.print("K ");
                }
                else{
                    System.out.print("_ " );
                }

            }
            System.out.println();
        }
    }
}
