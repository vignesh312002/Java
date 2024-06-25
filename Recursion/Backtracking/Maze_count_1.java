package Java.Recursion.Backtracking;

public class Maze_count_1 {
    public static void main(String[] args) {
         
        System.out.println(count(3, 3));

    
    }
    // COUNTING THE NUMBER OF PATH 

    static int count(int r,int c){
        if(r==1 ||  c==1){
            return 1;
        }
        int left=count(r-1, c);
        int rigth=count(r, c-1);
        return left+rigth;
    }

    
}
