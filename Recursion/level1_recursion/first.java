package Java.Recursion.level1_recursion;

public class first {
    public static void main(String[] args) {
        print(1);
    } 
    static void print(int n){
        if(n==10){
            return ; 
        }
        System.out.print(n +" ");
        print(n+1);
    }
}
