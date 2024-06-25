package Java.Recursion.Backtracking;

public class N_Queens_count {
    public static void main(String[] args) 
    {
        int n=4;
        boolean[][] board=new boolean[n][n] ;
        Queens(board, 0);// displays the matrix
        System.out.println(Queens(board, 0)); // total no of ways 
    }
    static int Queens(boolean [][] board,int row ){
        if(row==board.length){
            display(board);
            System.out.println();
            
            return 1;
        }
        int count=0;//the coun ti used to place the queen i the position

        for (int col = 0; col < board.length; col++) {
            //PLACE THE QUEEN IF THIS IS SAFE
            if(safe(board,row,col)){
                board[row][col]= true;
                count=count+Queens(board, row+1); 
                board[row][col]=false;
        }
    }
        return count;
    }

     private static boolean safe(boolean[][] board, int row, int col) {
            //checking the vertical
            for (int i = 0; i < row; i++) {
                if(board[i][col] )
                return false;
            }
            //checking for left diagnol
            int leftDigonal=Math.min(row,col);
            for (int i = 1; i <= leftDigonal; i++) {
                if(board[row-i][col-i]){
                    return false;
                }
            }
            //checking for rigth diognal
            //int rigthDigonal=board.length-row;
            int rigthDigonal=Math.min(row,board.length-col-1);
            for (int i = 1; i <= rigthDigonal; i++) {
                if(board[row-i][col+i] ){
                    return false;
                }
            }
            return true;
    }
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element: row ) {
                if(element){
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
