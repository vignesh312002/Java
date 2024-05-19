import java.util.Arrays;

public class set_mismatch {
    public static void main(String[] args) {
        int arr[]={2,1,4,2,6,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int correct=arr[i]-1; 
            if( arr[i]!=arr[correct]){
                swapping(arr, i, correct);
            }
            else{
                i++;
            }

        }
        //for seraching in element
        for (int index = 0; index < arr.length; index++) 
        {
        if(arr[index]!=index+1){
            return new int[]{arr[index],index+1};
        }
    }
    return new int[]{-1,-1};
}
static void  swapping(int arr[],int one,int two){
    int temp=arr[one];
    arr[one]=arr[two];
    arr[two]=temp;

}
}