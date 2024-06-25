package Java.Recursion.level1_recursion;

public class Example {
    public static void main(String[] args) {
        fun(1);
        System.out.println("");
        funRev(5);
    }
    static void fun(int n){
        if(n==6)
            return;
        System.out.print(n+" ");
        fun(n+1);
    }
    
    static void funRev(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        funRev(n-1);
    }

    
}
