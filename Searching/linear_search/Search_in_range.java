public class Search_in_range {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(Range(arr,1,3,3));
    }
    static int Range(int []arr,int start,int end,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int i = start; i < end; i++) {
            if(arr[i]==target){
                return target;
            }
            
        }
        return Integer.MAX_VALUE;
    }
}
