public class min_max {
    public static void main(String[] args) {
        int arr[]={7,8,9,5,6,-11};
        System.out.println(min_val(arr));
        System.out.println(max_val(arr));
    }
    static int min_val(int []arr){
        int min=arr[0];
        for (int i = 1; i < arr.length;i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
    return min;    
    }
    static int max_val(int []arr){
        int min=arr[0];
        for (int i = 1; i < arr.length;i++) {
            if(arr[i]>min){
                min=arr[i];
            }
        }
    return min;    
    }
}
