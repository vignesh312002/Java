public class power_ofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
    public static boolean isPowerOfTwo(int n) {
        if((n & (n-1))==0 ){
            return true;
        }
        return false;
    }
    //n=8 1000
    //n-1 =7 =0111
    //8 & 7 =0000 which is true 
}
