package Java.Arrays.Array_leetcode;

public class rotate_image {
    public static void main(String[] args) {
        int matrix[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                
            }
        }
        int n= matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;

            }
        }
        display(matrix);
    }

    private static void display(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }
}
