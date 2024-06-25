package Java.Recursion.recursion_sort;

import java.util.Arrays;

public class merge_recursion {
    public static void main(String[] args) {
    int arr[]={5,4,3,2,1}; 
    System.out.println(Arrays.toString(mergesort(arr)));       
    }
    static int [] mergesort(int []arr){
    if(arr.length==1){
        return arr;
    }
    int mid=arr.length/2;

    int[] left= mergesort(Arrays.copyOfRange(arr ,0, mid));
    int []right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));



    return merge(left,right);
    }
    static int[] merge(int[] first ,int[] second){
        int []arr=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                arr[k]=first[i];
                i++;

            }
            else{
                arr[k]=second[j];
                j++;

            }
            k++;
        }
        //it mey have one ore more array incomplete so 
       //copying the remaining elements
        while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
        return arr;
    }
}
