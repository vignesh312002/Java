package Java.Arrays.Array_leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiral_array {
    public static void main(String[] args) {
        int [][]matrix ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},{13,14,15,16}
        };
        
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;  //row
        int m=matrix[0].length; //col
        
        int top=0; int right=m-1; int bottom =n-1;  int left =0;
        List<Integer> list=new ArrayList<>();
        while (top<=bottom && left<=right) {
            
        
         for(int i=left;i<=right;i++ ){
            list.add(matrix[top][i]);
            System.out.println(list);
            
         }
         top++;
         
        for(int j=top;j<=bottom;j++){
            list.add(matrix[j][right]);
            System.out.println(list);

        }
        right--;

            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    list.add(matrix[bottom][k]);
                    System.out.println(list);

                }
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top ;l--){
                    list.add(matrix[l][left]);
                    System.out.println(list);


                }
                left++;
            }


        }    
        return list ;
    }
}
