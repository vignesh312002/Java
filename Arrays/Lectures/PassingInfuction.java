import java.util.Arrays;

public class PassingInfuction {
 public static void main(String[] args) {
    int nums[]={2,3,4,5,60};
    System.out.println(Arrays.toString(nums));
    change(nums);
 }   
 static void change(int arr[]){
    arr[4]=6;
    System.out.println(Arrays.toString(arr));
 }
}
 