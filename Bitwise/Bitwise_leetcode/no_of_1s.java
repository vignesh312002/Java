public class no_of_1s {
    public static void main(String[] args) {
       int n=20;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count =0;
        while(n>0){
        if( (n&1) == 1){
            count++;
        }
        n=n>>1;
        }    
        return count;    
    }
}
