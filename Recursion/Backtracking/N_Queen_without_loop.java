package Java.Recursion.Backtracking;

public class N_Queen_without_loop {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];
        queens(board, 0,0);
    }
    // IT WILL PRINT 4 SOLUTIONS BECAUSE OF THE MIRROR AND ROTATION 
    // IT CAN BE PLACED IN TWO WAY

    static void queens(boolean board [][],int row,int col){
        if(row==board.length){
            display(board);
            System.out.println();
        }
        if(col==board.length){
            return ;
        }
        ///placing the queen 
        
            if(safe(board,row,col)){
                board[row][col]= true ;
                queens(board, row+1, 0);
                board[row][col]=false;
            }
            
            queens(board, row,col+1);
        
    }
    private static boolean safe(boolean[][] board, int row, int col) {
         //micddle column
         for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //leftdiagnol
        int leftdiagnol=Math.min(row,col);
        for(int i=1;i<=leftdiagnol;i++){
            if(board[row-i][col-i]){
                return false ;
            }
        }
       
        //right diagnol
        int rigthdigonal=Math.min(row,board.length-col-1);


        for (int i = 1; i <=rigthdigonal; i++) {
            if(board[row-i][col+i]){
                return  false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==true){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
