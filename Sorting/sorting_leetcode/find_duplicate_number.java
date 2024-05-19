public class find_duplicate_number {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public  static int findDuplicate(int[] arr) {
        
        for (int i = 0; i < arr.length;) {
            if(arr[i]!=i+1){
            int correct=arr[i]-1; 
            if( arr[i]!=arr[correct]){
                swapping(arr, i, correct);
            }
            else{
                return arr[i];
            }
        }
        else{
            i++;
        }
        }
        return -1;
    }
    static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    }
}
