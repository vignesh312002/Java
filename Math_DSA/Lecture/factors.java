import java.util.*;
public class factors {
    public static void main(String[] args) {
        //factor1(20);
        factor2(20);
    }
    static void factor1(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
    static void factor2(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n % i==0){
                System.out.print(i+" ");
                //list.add(i) ;
                list.add(n/i);
            }

        }
       for (int i = list.size()-1; i >=0; i--) {
        System.out.print(list.get(i)+" ");
       }
    }
}
