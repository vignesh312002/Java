public class first_missing_positive {
    public static void main(String[] args) {
       int arr []={3,4,-1,1};
       System.out.println(firstMissingPositive(arr));
    }
    public static  int firstMissingPositive(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int correct=arr[i]-1; 
            
            if(arr[i]<arr.length && arr[i]>0 && arr[i]!=arr[correct]){
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
            return index + 1;
        }   
        

        }
        return arr.length; // here length+1 is the answer  because a num is missing 
    }
    static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    }
}
