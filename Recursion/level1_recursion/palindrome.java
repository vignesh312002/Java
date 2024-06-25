package Java.Recursion.level1_recursion;

public class palindrome {
public static void main(String[] args) {
  System.out.println(palin(343));  
}
static int pal(int n){
    int rem =0;
    while(n!=0){
       rem= rem*10+n%10;
        n=n/10;
    }
    return rem;  
}
static boolean palin(int n){
    if(n==pal(n)){
        return true;
    }
    else{
        return false;
    }
}
}
