public class reverse_integer {
public static void main(String[] args) {
    int num=-123;
    System.out.println(reverse(num));
}
public static int reverse(int x) {
        return rev(x);
}
static int rev(int n){
        long sum=0;
        while(n!=0 ){
            int digit =n%10;
            sum=sum*10+digit;
            n=n/10;
        }
        if(sum >Integer.MAX_VALUE || sum <Integer.MIN_VALUE){
            return 0;
        }
    
    return (int) sum;
}
}
