public class sub_prod_from_number {
    public static void main(String[] args) {
        int num=234;
        System.out.println(subractProductAndSum(num));
    }
    static int subractProductAndSum(int n){
        int product=1;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            product=product*digit;
            sum=sum+digit;
            n=n/10;
        }
        
        int ans=product-sum;
        return ans;
    }
}
