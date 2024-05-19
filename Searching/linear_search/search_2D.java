import java.util.Arrays;

public class search_2D {
    public static void main(String[] args) {
        int arr [][]= 
        {
            {1,2,3},
            {24,35,68,50},
            {93,23,57} 
        };
        int target=50;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(Max_element(arr));
    }
    static int[] search(int [][]array,int target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Max_element(int [][]array){
        int max=array[0][0];
        //int max=Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col]>max){
                    max=array[row][col];
                }
            }
        }
        return max;
    }
}
