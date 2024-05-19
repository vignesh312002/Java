public class Linear_search {
    public static void main(String[] args) {
        int arr[]={23,4,5,7,36,3};
        System.out.println(linear(arr, 7));
    }
    static int linear(int[]arr,int target)
    {      
        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) 
        {
            if( arr[index]==target){
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}

