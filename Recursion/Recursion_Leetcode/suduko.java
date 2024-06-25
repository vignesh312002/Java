package Java.Recursion.Recursion_Leetcode;

public class suduko {
    public static void main(String[] args) {
        char [][] board={
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        if(Suduko(board)){
            display(board);
        }
        else{
            System.out.println("cannot be solved");
        }
    }
     // 1) HERE WE ARE CHECKING FOR THE EMPTY CELL(.)
     static boolean Suduko(char [][] board){
        int row=-1;
        int col=-1;
        boolean emptySpace=true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    row=i;
                    col=j;
                    emptySpace=false;
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
        char num= (char)(number +'0');
        // 1= 49  49+0= 49 = 1
        if(safe(board,row,col,num)){
            
            board[row][col]=num;
            if(Suduko(board)){
                return true;
            }
            else{
                board[row][col]='.';
            }
        }
    }
    return false;
    }
    // 3 checking the safe place 
    private static boolean safe(char[][] board, int row, int col,char num) {
        //3.1 CHECKING THE SAFE POSITION FOR ROW 
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==num){
                return false; //already present cannot place 
            }
        }
        // 3.2 CHECKING FOR THE SAFE POSITION IN COL
        for (int j = 0; j < board[0].length; j++) {
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
    static void display(char[][]board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
