package Java.Recursion.recursion_sort;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        // quick(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

    }
    public static void quick(int arr[],int low,int high){
        if(low>=high){
            return ;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2; //pivot index

        int pivot=arr[mid];//pivot element

        while(s<=e){
            //also a reason if it is already sorted it will not sort 
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
        if(s<=e){ // here tthe condition is important
            int temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
            // now the pivot is in the right element so sort the two halfes
        }
        quick(arr,low,e); //condition breached 
        quick(arr,s,e );//condition breached
    }
}
