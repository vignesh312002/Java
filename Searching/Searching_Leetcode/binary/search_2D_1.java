public class search_2D_1 {
    public static void main(String[] args) {
        int arr[][]={
            {1,3}
        
        };
        System.out.println(search(arr,3));
        
    }
    static boolean search(int arr[][],int target){
        if(arr==null || arr.length ==0||arr[0].length==0  ){
            return false;
        }
        int n=arr.length;
        int m= arr[0].length;
        int start=0;
        int end=n * m  - 1; //m*n-1(row*col-1)
       
        while(start<=end){
            int mid=start+(end-start)/2;
            int midvalue = arr[mid /m][mid % m];
            if(midvalue == target){
                return true;
            }
            if(target>midvalue){
                start=mid+1;
            }
            if(target<midvalue){
                end=mid-1;
            }
        }
    return false;    
    }
    }
