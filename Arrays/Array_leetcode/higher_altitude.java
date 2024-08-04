package Java.Arrays.Array_leetcode;

public class higher_altitude {
    public static void main(String[] args) {
        int arr[]={-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int sum =0;
        int arr[]=new int [gain.length];
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            arr[i]=sum;

        }
        int num=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]> num ){
                num= arr[i];
            }
        }
     if(num<0){
        return 0;
     }
     return num;
    }
}
