import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));   
    }
    static void bubble_Sort(int arr[]){
        boolean swapped;
        for(int i=0;i<=arr.length-1 ;i++){
            swapped=false;
            for(int j=1;j<=arr.length-i-1;j++ ){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //no swaep occured it will break and only one loop runs 
            if(swapped==false){
                break;
            }
        }
    } 
}
