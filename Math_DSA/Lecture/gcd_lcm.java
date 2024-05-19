public class gcd_lcm {
public static void main(String[] args) {
    System.out.println(gcd(20, 40));
    System.out.println(lcm(20, 40));
}
static int gcd(int a,int b){
    //hcf or gcd 
    if(a==0){
        return b;
    }
    return gcd( b%a ,a);
}
static int lcm(int a,int b){
    return a*b / gcd(a,b);
}
}
