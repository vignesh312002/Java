package Java.Recursion.level1_recursion;

public class level_1 {
    public static void main(String[] args) {
    System.out.println(sum(123));  
    System.out.println(sumRec(1432));  
    System.out.println(product(12345));
    concept(5);
    reverse(1234);
    System.out.println(sum);
    rev(5678);
} 
    static int  sum(int n){
    int rem=0;
        while(n!=0){
         rem=rem+ n%10;
         n=n/10;
        }

        return rem;
    }
    static int sumRec(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumRec(n/10);
    }
    static int  product(int n){
        if(n==1){ // or  n%10==n
            return n ;
        }
        return n%10 * product(n/10);
    } 
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        concept(--n); //n-- vs --n
    }
    //way 1
    static int sum=0;
    static void reverse(int n){
        
        if(n==0){
            return;
        }
        int rem=n %10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    public static void rev(int n){
        int rem=0;
        if(n<1){
            return ;
        }
        else{
            rem=rem * 10 + n%10;
            System.out.print(rem);
            rev(n/10);
            
        }
        /*if(n==rem){
            System.out.println();
            System.out.println("they are palindrome");
        }*/
    }

}
