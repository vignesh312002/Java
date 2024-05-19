public class sqrt_of_number {
    public static void main(String[] args) {
		int x=10;
        System.out.println(search(x));
    }
    
    static long  search(int n){
        int start=0;
        int end =n;
        
        int  root=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid * mid == n){
               root= mid;
               return root;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            if(mid*mid<n){
                start=mid+1;
                root =mid;
            }
        }
        return root;
    }
}
