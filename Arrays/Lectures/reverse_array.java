import java.util.Arrays;
public class reverse_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println("reversed array "+Arrays.toString(arr));
        //reversed(arr);
    }
    // TWO POINTER METHOD IS USED HERE
    static void reverse(int []arr){
    int start=0;
    int end=arr.length-1;
    while(start<end){ 
        swapping(arr,start,end);
        start++;
        end--;
    }
}
    static void swapping(int []arr,int index1,int index2){
     int temp=0;
     temp=arr[index1];
     arr[index1]=arr[index2];
     arr[index2]=temp;

    }
    static void reversed(int []arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}

