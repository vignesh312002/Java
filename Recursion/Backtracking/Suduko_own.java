package Java.Recursion.Backtracking;

public class Suduko_own {
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
        System.out.println("the suduko cannot be solved");
    }
    }

    // 1) HERE WE ARE CHECKING FOR THE EMPTY CELL(0)
    static boolean solve(int [][] board){
        int row=-1;
        int col=-1;
        boolean emptySpace=false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    row=i;
                    col=j;
                    emptySpace=true;
                    break;
                }
            }
            if(emptySpace==false){
                break;
            }
            
        }
        if(emptySpace==true){
            return true;
        }
    // 2) PLACING THE NUMBER IN THE EMPTY CELL    
    for (int number = 1; number <= 9; number++) {
        if(isSafe(board,row,col,number)){
            board[row][col]=number;
            if(solve(board)){
                return true;
            }
            else{
                board[row][col]=0;
            }
        }
    }
    return false;
    }
        // 3 checking the safe place 
        static boolean isSafe(int[][] board, int row, int col,int num) {
            //3.1 CHECKING THE SAFE POSITION FOR ROW 
            for (int i = 0; i < board.length; i++) {
                if(board[row][i]==num){
                    return false; //already present cannot place 
                }
            }
            // 3.2 CHECKING FOR THE SAFE POSITION IN COL
            for (int j = 0; j < board.length; j++) {
                if(board[j][col]==num){
                    return false; //already present cannot place 
                }
            } 
    
            // 3.3 CHECKING FOR THE SAFE POSITION IN THE (3x3) BOX
             
            // HERE WE ARE FINDING THE START AND END POSITION OF THE 3x3 BOX
            //TO FIND IT WEE MUST FIRST FIND THE LENGTH 
            //TO FIND THE LENGTH WE NNED TO PERFOREM THE SQUARE ROOOT OF THE BOARD SIZE
            int sqrt=(int) Math.sqrt(board.length);
            int rowStart= row -row % sqrt;
            int colStart=col -col % sqrt;
             for (int i = rowStart; i < rowStart + sqrt ; i++) {
                for (int j = colStart; j < colStart +sqrt ; j++) {
                    if(board[i][j] == num){
                        return false;
                    }
    
                }
             }
            return true;
    
        }
        static void show(int[][]board){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
}
     