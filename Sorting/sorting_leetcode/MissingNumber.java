
//  IMPLEMENT OIN PEN AND PAPER
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={0,1};
        
        System.out.println(cyclic(arr));
    } 
    static int  cyclic(int []arr){
        for (int i = 0; i < arr.length;) {
            //int correct=arr[i]; 
            if(arr[i]<arr.length && i!=arr[i]){
                swapping(arr, i, arr[i]);
            }
            else{
                i++;
            }

        }
        //for seraching in element
        for (int index = 0; index < arr.length; index++) 
        {
        if(arr[index]!=index){
            return index;
        }    

        }
    //case2 
        return arr.length;
      }
      static void  swapping(int arr[],int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    
    }
}
