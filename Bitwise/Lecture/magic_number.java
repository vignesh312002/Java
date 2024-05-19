public class magic_number {
    public static void main(String[] args) {
    
System.out.println(magic(5));
System.out.println(digit(20,2));
System.out.println(pascalsum(5))  ;
System.out.println(power_of_two(0));
System.out.println(power(3, 6));
System.out.println(setbit(10));
//find the xor of number in range is a and b
//formula = xor_num(b)^xor_num(n-1)
int a=3;
int b=9;
int ans=xor_num(b)^xor_num(a-1);
System.out.println(ans);
}
    public static int magic(int n){

        int ans=0;
        int base=5;
        while(n>0){
            int last =n&1;
            n=n>>1;
            last=last * base;
            base=base*5;
            ans=ans+last;

        }
        return ans;
    }
    static int digit(int n,int b){
        // help to find the number of digits 
        int ans = (int)(Math.log(n) / Math.log(b))+1;
        return ans;
    }
    static int pascalsum(int n){
        //sum of row in pascal
        int ans=1<<(n-1);
        return ans;
    }
    static boolean power_of_two(int n){
        //whether the number is power fo 2 
        if(n==0){
            return false;
        }
        boolean ans=(n & (n-1))==0;

        return ans;
    }
    static int power(int n,int power){
        int ans=1;
        int base=3;
        while (power>0) {
        if((power & 1) ==1){
            ans=ans*base;
        }
        base=base*base;
        power=power>>1; 
    }
        return ans;
    }
    static int setbit(int n){
        int count=0;
        while(n>0){
        if((n&1)==1){
            count++;
            
        }
        n=n>>1;
    }
        return count;
    }
    static int xor_num(int n){
        if(n%4==0){
            return 0;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;
    // to check the answer use the foor loop
    }
}
