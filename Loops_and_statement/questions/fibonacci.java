public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int n=7;

        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
        
    }
}
