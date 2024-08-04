package Java.Arrays.Array_leetcode;

public class diagnol_sum {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalSum(arr));

    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int dia=mat[0].length-1;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(i == j){
                    sum += mat[i][j];  // Primary diagonal
                }
                if(i + j == dia && i!=j   ){
                    sum += mat[i][j];  // Secondary diagonal excluding the middle element
                }
            }
        }
        return sum;
    }
    // public static int diagonalSum(int[][] mat) {
    //     int sum = 0;
    //     int n = mat.length;
    
    //     for (int i = 0; i < n; i++) {
    //         // Add the primary diagonal element
    //         sum += mat[i][i];
            
    //         // Add the secondary diagonal element if it's not the same as the primary diagonal element
    //         if (i != n - i - 1) {
    //             sum += mat[i][n - i - 1];
    //         }
    //     }
        
    //     return sum;
    // }
    
}

