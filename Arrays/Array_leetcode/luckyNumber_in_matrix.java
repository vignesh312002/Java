package Java.Arrays.Array_leetcode;

import java.util.ArrayList;
import java.util.List;

public class luckyNumber_in_matrix {
    public static void main(String[] args) {
        int matrix [][]=
        {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };
        
        List<Integer> lucky=luckyNumbers(matrix);
        System.out.println(lucky);

        
    }
   
    public static List < Integer > luckyNumbers (int[][]matrix)
    {
      int m = matrix.length;
      int n = matrix[0].length;
  
      int[] minrow = new int[m];
      int[] maxcol = new int[n];
  
      for (int i = 0; i < m; i++)
        {
          minrow[i] = Integer.MAX_VALUE;
          for (int j = 0; j < n; j++)
            {
              minrow[i] = Math.min (minrow[i], matrix[i][j]);
              maxcol[j] = Math.max (maxcol[j], matrix[i][j]);
            }
        }
      List < Integer > list = new ArrayList <> ();
      for (int a = 0; a < m; a++)
        {
          for (int b = 0; b < n; b++)
            {
              if (minrow[a] == matrix[a][b] && maxcol[b] == matrix[a][b])
                {
                  list.add(matrix[a][b]);
                }
            }
        }
      return list;
    }
}
