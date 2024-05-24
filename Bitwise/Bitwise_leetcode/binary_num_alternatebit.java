public class binary_num_alternatebit {
    public static void main(String[] args) {
        int n=88;
        System.out.println(hasAlternatingBits(n));
    }
    public static boolean hasAlternatingBits(int n) {
        int ans= n&1;
        int shift= (n>>1) & 1;
        if(ans != shift){
            return true;
        }
        return false;
    }

}
