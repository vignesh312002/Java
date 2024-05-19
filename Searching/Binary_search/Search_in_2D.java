import java.util.Arrays;

public class Search_in_2D {
    public static void main(String[] args) {
      int arr[][]=
      {
       {1,2,3},
       {4,5,6}//it can also be m X n matrix 
      } ; 
      System.out.println(Arrays.toString(Search(arr,3 )));
    }
    static int[] Search(int arr[][],int target){
          int row=0;
          int col =arr[0].length-1;
          while(row<arr.length && col>=0){
                if(arr[row][col]==target){
                    return new int []{row,col};
                }
                if(target>arr[row][col]){
                    row=row+1;
                }
                if(target<arr[row][col])
                {
                    col=col-1;
                }

          } 
          return new int[]{-1,-1};
    }
}
