public class prime {
   public static void main(String[] args) {
    int n=15;
    for(int i=1;i<n-1;i++){

    if(isPrime(i)==true)
        System.out.print(" " + i);
    }
    //System.out.println(isPrime(11));
   }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                return false;
            }   
    }
       return true;
    }
}
//time complexity id O(2n)
