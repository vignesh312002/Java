package Java.Recursion.Recursion_questions;

public class sum_of_naturalNumbers {
    public static void main(String[] args) {
        int n=6;
        System.out.println(sumNumbers(n));

    }
    static int sumNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + sumNumbers(n-1);
    }
}
