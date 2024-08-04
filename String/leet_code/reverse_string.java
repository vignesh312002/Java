package Java.String.leet_code;

public class reverse_string {
    public static void main(String[] args) {
        char[]arr  ={'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(arr);
        
    }
    public static void reverseString(char[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swapped(arr,start,end);
            start++;
            end--;
           
        }
    }
    private static  void swapped(char[] arr,  int start, int  end) {
   char temp=arr[start];
   arr[start]=arr[end];
   arr[end]=temp;
}
}
