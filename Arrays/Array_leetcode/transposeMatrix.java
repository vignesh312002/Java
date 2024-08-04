package Java.Arrays.Array_leetcode;



public class transposeMatrix {
    public static void main(String[] args) {
       int matrix[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
       };
       
       int [][] transposedMatrix=transpose(matrix);
       display(transposedMatrix);
    
    }
    private static void display(int[][] transposedMatrix) {
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix.length; j++) {
                System.out.print(transposedMatrix[i][j]);

            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;   
        int [][]array= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=matrix[j][i];
            }
        }
        return array;
    }
}
