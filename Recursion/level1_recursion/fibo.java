package Java.Recursion.level1_recursion;

public class fibo {
    public static void main(String[] args) {
        //int sum=fibonacci(3);
        // System.out.println((sum));
        // for(int i=0; i<11;i++){
        //     System.out.println(fiboformula(i));
        // }
        System.out.println(fibonacci(3));
        
        System.out.println(fiboformula(3));
    } 
     
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static long fiboformula(int n){
        //return (int)(Math.pow(((1 + Math.sqrt(5))/2),n) /Math.sqrt(5));
        //return (long )Math.pow(1.61803399, n);
        return (long)((Math.pow(((1+Math.sqrt(5)) / 2),n) /Math.sqrt(5)));
    } 
}    
