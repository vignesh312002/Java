package Java.Recursion.level1_recursion;

public class count_zero {
public static void main(String[] args) {
   /*int n=3040;
   int rem=0;
   int count=0;
   while(n>0)
   {
        if((rem=n%10)==0)
        {
            count++;
        }
        n=n/10;
    }
System.out.println(count); */
System.out.println(zero(10203, 0));
} 
static int zero(long n,int count){
    if(n==0){
        return count;
    }
    if(n%10==0){
        count++;
    }
    return zero(n/10,count);
    
   

}
}
