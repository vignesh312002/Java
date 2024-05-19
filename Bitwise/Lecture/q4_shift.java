public class q4_shift {
    public static void main(String[] args) {
        System.out.println(shift(10));
        System.out.println(q5_shift(10));
        }
    static int shift(int n){
        int pos=3;
        
        return n & (1<<pos );
    }
    static int q5_shift(int n){
        int pos=2;
        return n | (1<<pos);
        }
    /*static int q6_shift(int n){
        int pos=2;
         return  ! (n&(1<<pos));
    }*/
} 
