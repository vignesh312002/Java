import java.util.Arrays;
import java.util.Scanner;

public class input {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    /* 
    // THREE WATYS TO PRINT THE ELEMENTS
    //WAY -1 
    int arr[]=new int[5];
    arr[0]=12;
    arr[1]=24;
    arr[2]=124;
    arr[3]=456;
    arr[4]=345;
    System.out.println(arr[3]);
    
    //WAY -2 FORR LOPOPS AND FOR EACH
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt(); 
    }
    // for every elemenmt in the array print  the element 
    for (int i : arr) {// num is the element in the array
                       //arr is the array
        System.out.print(i);
    }
    //WAY-3 ARRAYS.TO STRING
    System.out.println(Arrays.toString(arr));*/

    String[] str=new String[5];
    for (int i = 0; i < str.length; i++) {
        str[i]=sc.next();
    }
    System.out.println(Arrays.toString(str));
    sc.close();
}
}
