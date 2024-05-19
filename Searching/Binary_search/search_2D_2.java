public class search_2D_2 {
    public static void main(String[] args) {
       int arr[][] ={
        {1,4,7},
        {2,5,8},
        {3,6,9}
       };
       System.out.println(searchMatrix(arr,9));
    }
    public  static boolean searchMatrix(int[][] arr, int target) {
        int row=0;
          int col =arr[0].length-1;
          while(row<arr.length && col>=0){
                if(arr[row][col]==target){
                   return true;
                }
                else if(arr[row][col]<target){
                    row=row+1;
                }
                else{
                    col=col-1;
                }

          } 
          return false;
    }

}
