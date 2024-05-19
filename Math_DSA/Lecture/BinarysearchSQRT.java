public class BinarysearchSQRT {
    public static void main(String[] args) {
        int n=8;
        int p=3;
        
        System.out.printf("%.3f",sqrt(n,p));
        

    }
static double sqrt(int n,int p){
    int s=0;
    int e=n;
    double root=0.0;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(mid*mid==n){
            root=mid;
            return root;
        }
        if(mid * mid>n){
            e=mid-1;
        }
        else{
            s=mid+1;
            //root=mid for integer part the code wil change 
       }

    }
    double inc =0.1;
    for(int i=0;i<p;i++){
        while(root*root<=n){
            root=root+inc;
        }
        root =root-inc;
        inc=inc/10;
    }
    return root ;
}

}