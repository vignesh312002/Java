public class Maximum {
    public static void main(String[] args) {
        int []arr={12,45,67,34,25};
        System.out.println(max(arr)); 
        System.out.println(max1(arr)); 
        System.out.println(maxrange(arr,3,4));
    }
    static int max(int[]arr){
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
            
        }
     return max;   
    }
    static int max1(int []arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }
    static int maxrange(int []arr,int index1,int index2){
        // adding edege cases 
        if(index1>index2){
            return -1;
        }
        if(arr ==null){
            return -1;
        }
        
        int max=arr[index1];
        for (int i = index1; i <= index2; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }
}
