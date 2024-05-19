public class odd_even {
    public static void main(String[] args) {
        System.out.println(isodd(19));
    }
    static boolean isodd(int n){
        return (n & 1)==1;
    }
}
