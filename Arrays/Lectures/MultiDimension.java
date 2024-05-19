
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

     //creation of 2D arrays
     int arr[][]=new int [3][3];//it is not necessary to mention column
     //[1,2,3]
     //[4,5,6]
     //[7,8,9]
     System.out.println(arr.length);//it prints the length of rows
     //INPUT
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
     }
     //OUTPUT 
      
    for (int i = 0; i < arr.length; i++) {
        /*for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] +" ");
            
        }*/
        
        System.out.println(Arrays.toString(arr[i]));
    }
    //ANOTHER WAY OF OUTPUT 
    for (int[] i : arr) {
        System.out.println(Arrays.toString(i));
    }
 


    sc.close();
    }

}
